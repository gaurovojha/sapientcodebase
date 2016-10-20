package practice.sapient.usecase.carparking;

import java.util.List;
import java.util.Map;

import practice.sapient.usecase.carparking.service.ChargeVehicleService;
import practice.sapient.usecase.carparking.service.ParkVehicleService;

public class ParkingLot {

	private ChargeVehicleService chargeVehicleService;
	private ParkVehicleService parkingVehicleService;
	
	
	
	private static ParkingLot parkingLOT;
	List<Slot> slots;
	Map<String, List<Slot>> vehicleSlotMap;
	Map<String, TimeTrack> vehicleTimeMap;

	private ParkingLot() {

	}

	public static ParkingLot getInstance(ChargeVehicleService chargeVehicleService) {
		if (parkingLOT == null) {
			parkingLOT = new ParkingLot();
			parkingLOT.chargeVehicleService = chargeVehicleService;
		}
		return parkingLOT;
	}

	public void parkVehicle(Vehicle v) {

	}

	public void exitParking(Vehicle v) {

	}
	
	public void chargeVehicle(Vehicle v){
		
	}

}
