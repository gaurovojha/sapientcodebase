package practice.sapient.practice.usecase.carparking.service;

import java.util.Calendar;
import java.util.Map;

import practice.sapient.usecase.carparking.TimeTrack;
import practice.sapient.usecase.carparking.Vehicle;
import practice.sapient.usecase.carparking.util.DateTimeUtility;

public class ChargeVehicleService {

	public long chargeVehicle(Vehicle v, Map<String,TimeTrack> timeMap){
		long totalCharge = 0;
		TimeTrack timeTrack = timeMap.get(v.getVehicleNo());
		long difference = DateTimeUtility.calculateTimeDifference(timeTrack.getEntryTime(),Calendar.getInstance().getTime());
		if("CAR".equals(v.getVehicleType())){
			totalCharge = difference * 3 ;
		}
		else if("TRUCK".equals(v.getVehicleType())){
			totalCharge = difference * 6;
		}else{
			
		}
		return totalCharge;
	}
	
}
