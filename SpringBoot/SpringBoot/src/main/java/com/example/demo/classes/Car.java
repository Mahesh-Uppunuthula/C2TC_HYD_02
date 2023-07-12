package com.example.demo.classes;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
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
	
	public String show() {
		return "In show";
	}

}
