package practice.sapient.usecase.carparking;

import java.util.List;

public interface Vehicle {
	
	String getVehicleNo();
	String getVehicleType();
	void park(List<Slot> slots);

}
