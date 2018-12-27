package com.ari.commerce.catalog.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ari.commerce.catalog.model.StoreModel;
import com.ari.commerce.catalog.repository.StoreRepository;

@Service
public class StoreService {

	   @Autowired
	    private StoreRepository storeRepository;

	    public StoreModel addStore(StoreModel storeModel) {
	        return  storeRepository.addStore(storeModel);
	    }

	    public StoreModel findById(int id) {
	        return storeRepository.findById(id);
	    }

	    public List<StoreModel> findAll() {
	        return storeRepository.findAll();
	    }
}
