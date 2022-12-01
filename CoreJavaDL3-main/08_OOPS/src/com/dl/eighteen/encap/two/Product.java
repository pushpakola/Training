package com.dl.eighteen.encap.two;

public class Product {

	int id;
	String pName;
	
	public String getId() {
		return String.valueOf(id);
	}
	public void setId(String id) {
		this.id = Integer.parseInt(id);
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
	
}
