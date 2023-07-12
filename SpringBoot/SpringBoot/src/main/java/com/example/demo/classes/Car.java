package com.example.demo.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
 * by default the spring Beans in the Spring Container are created using 'singleton' Scope
 * when a component is created.
 * 
 * by default @Scope is mentioned or used in the background.
 *  so we don't have to mention it again.
 * 
 * 
 * -------------------SINGLETON SCOPE------------------------
 * 
 * @Scope(value="singleton"):
 * 
 * which creates a 'SINGLE INSTANCE' of each component
 * mentioned using '@Component' annotation 'NO MATTER IF IT IS USED OR NOT'.
 * 
 * 
 * -------------------PROTOTYPE SCOPE---------------------
 * @Scope(value="prototype"):
 * 
 * which creates a 'INSTANCES' of a specified component
 * mentioned using '@Component' annotation 
 *		-ONLY WHEN MENTIONED &
 *		-CREATES SPECIFIED NUMBER OF TIMES.
 * */
@Scope(value="prototype")
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
		System.out.println("Object Created");
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
