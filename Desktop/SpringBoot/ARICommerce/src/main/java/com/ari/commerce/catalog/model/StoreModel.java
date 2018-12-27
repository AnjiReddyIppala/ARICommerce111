package com.ari.commerce.catalog.model;

import org.springframework.data.annotation.Id;


public class StoreModel {

	@Id
	private int storeId;
	private String storeName;
	private String storeType;
	private int state;
	private int optCounter;
	
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreType() {
		return storeType;
	}
	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getOptCounter() {
		return optCounter;
	}
	public void setOptCounter(int optCounter) {
		this.optCounter = optCounter;
	}
}
