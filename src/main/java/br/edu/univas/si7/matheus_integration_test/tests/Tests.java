package br.edu.univas.si7.matheus_integration_test.tests;

import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.univas.si7.matheus_integration_test.StoreDTO;

// import br.edu.univas.si7.matheus_integration_test.StoreController;

public class Tests {
	
	/*
	
	5 Casos = 5 Testes 
	
	Salvar um Novo Objeto: 
		1. Caso de Sucesso 
		2. Caso Erro quando o Objeto já Existe 
		3. Caso Erro quando algum dado no JSON esteja invalido 
	
	Ativar/Desativar um Objeto (Update do campo Active)
		4. Caso de Sucesso 
		5. Caso de Erro quando o Objeto não Existe 
	
	*/
	
	// @Test
	private void testCreateStoreSuccess(/*StoreDTO store*/) {
		//store = StoreController.createStore(store);
		//verify(StoreController.getStoreById(store.id));
	}

	private void testCreateStoreAlreadyExist(/*StoreDTO store*/) {
		//verify(StoreController.getStoreById(store.id));
	}

	private void testCreateStoreInvalidData(/*StoreDTO store*/) {
		/*
		assertThrows(IllegalArgumentException.class, () -> {
        	service.createStore(newStoreDTO);
    	});
		
		
		*/
		
	}

	private void deActivateStoreSuccess(/*StoreDTO dto, Long cnpj*/) { // deActivate = ativar e desativar 
		//verify(StoreController.updateStore(dto. cnpj));
	}

	private void deActivateStoreAlreadyExist(/*StoreDTO dto, Long cnpj*/) { // deActivate = ativar e desativar 
		//verify(StoreController.updateStore(dto. cnpj));
	}
	
}
