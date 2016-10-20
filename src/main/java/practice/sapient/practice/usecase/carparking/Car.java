package practice.sapient.practice.usecase.carparking;

import java.util.List;

public class Car implements Vehicle {

	
	private String vehicleNo ;
	private String vehicleType ; 
	
	public Car(String vehicleNo, String vehicleType){
		this.vehicleNo = vehicleNo ;
		this.vehicleType = vehicleType ;
	}
	
	public String getVehicleNo() {
		return null;
	}

	public String getVehicleType() {
		return null;
	}

	public void park(List<Slot> slots) {
		
	}



}
