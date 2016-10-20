package practice.sapient.usecase.carparking;

import java.util.List;

public class Truck implements Vehicle {

	private String vehicleNo;
	private String vehicleType;

	
	public Truck(String vehicleNo, String vehicleType){
		this.vehicleNo = vehicleNo ;
		this.vehicleType = vehicleType ;
	}
	
	public String getVehicleNo() {
		return vehicleNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void park(List<Slot> slots) {

	}

}
