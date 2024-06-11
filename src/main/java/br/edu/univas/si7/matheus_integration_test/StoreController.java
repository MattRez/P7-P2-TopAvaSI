// package com.topicos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/*
import com.topicos.dtos.StoreDTO;
import com.topicos.service.StoreService;
*/

@RestController
@RequestMapping("/api/store")

public class StoreController {
	@Autowired
	private StoreService service;
	
	@GetMapping("/{cnpj}")
	public StoreDTO getStoreById(@PathVariable Long cnpj) {
		return service.findById(cnpj);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateStore(@RequestBody StoreDTO dto, @PathVariable Long cnpj) {
		service.updateStore(dto, cnpj);
	}
	
	@DeleteMapping("/{cnpj}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteStore(@PathVariable Long cnpj) {
		service.deleteStore(cnpj);
	}

	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public void createStore(@RequestBody StoreDTO store) {
		service.createStore(store);
	}
}
