package com.example.demo.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	/*
	 * @Autowired is an annotation used for referring a dependency object
	 * here 'Car' object is depending on 'Vehicle' object 
	 * */
	@Autowired
	Vehicle v;
	
	private int cid;
	private String name;
	public int getCid() {
		return cid;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", name=" + name + "]";
	}
	
	public String showProof() {
		return "I'm a Car and\n[" + v.showVehicleDependency() + "] is my proof that I'm a Vehicle";
	}

}
