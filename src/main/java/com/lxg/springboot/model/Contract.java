package com.lxg.springboot.model;


public class Contract {
	
	
	private String description;
	
	private String name;
	
	private String version;
	
	private int id;
	
	private int chainid;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getChainid() {
		return chainid;
	}

	public void setChainid(int chainid) {
		this.chainid = chainid;
	}


}
