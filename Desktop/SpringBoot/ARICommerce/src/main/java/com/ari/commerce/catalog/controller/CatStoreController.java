package com.ari.commerce.catalog.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ari.commerce.catalog.model.StoreModel;
import com.ari.commerce.catalog.service.StoreService;

@RestController
@RequestMapping("/store")
public class CatStoreController {

	    @Autowired
	    private StoreService storeService;

	    @RequestMapping(value="/add/v1", method= RequestMethod.POST)
	    public @ResponseBody StoreModel addPessoa(@RequestParam("storeId") int storeId, @RequestParam("storeName") String storeName, @RequestParam("storeType") String storeType,
	    		@RequestParam("state") int state, @RequestParam("optCounter") int optCounter) {
	    	//System.out.println("AnjiReddy "+id);
	    	StoreModel storeModel = new StoreModel();
	    	storeModel.setStoreId(storeId);
	    	storeModel.setStoreName(storeName);;
	    	storeModel.setStoreType(storeType);
	    	storeModel.setState(state);
	    	storeModel.setOptCounter(optCounter);
	    	
	        return storeService.addStore(storeModel);
	    }

	    @RequestMapping("/findById/{storeId}")
	    public @ResponseBody StoreModel findPersonById(@PathVariable("storeId") int storeId) {
	        return storeService.findById(storeId);
	    }

	    @RequestMapping("/getAllStores/v1")
	    public @ResponseBody List<StoreModel> findAll() {
	    	System.out.println("*********************************");
	        return storeService.findAll();
	    }
}
