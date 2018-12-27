package com.ari.commerce.catalog.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.ari.commerce.catalog.model.StoreModel;;

@Repository
public class StoreRepository {

	    @Autowired
	    private MongoTemplate mongoTemplate;

	    public StoreModel addStore(StoreModel mongo) {
	        mongoTemplate.save(mongo);
	        return  mongo;
	    }

	    public StoreModel findById(int id) {
	    	StoreModel pessoa = mongoTemplate.findById(id, StoreModel.class);
	        return pessoa;
	    }

	    public List<StoreModel> findAll() {
	        List<StoreModel> pessoas = mongoTemplate.findAll(StoreModel.class);
	        return pessoas;
	    }
}
