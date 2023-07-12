package com.example.demo.classes;

import org.springframework.stereotype.Component;

/**
 * @Component is an annotation which creates an object of a class &
 * puts it in a 'SPRING DEPENDENCY CONTAINER' 
 * where are all the object of different components are stored
 * */

@Component
public class Vehicle {
	private int vId;
	private String VName;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getvId() {
		return vId;
	}
	
	public void setvId(int vId) {
		this.vId = vId;
	}
	
	public String getVName() {
		return VName;
	}
	
	public void setVName(String vName) {
		VName = vName;
	}
	
	public String showVehicleDependency() {
		return "VehicleProofNum:123";
	}

	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", VName=" + VName + "]";
	}
	
	
}
