package com.person.map.constant;

public enum Types {
	TAG("tag"),
	ARTICLE("post");
	
	
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	Types(String type){
		this.type = type;
	}
	

}
