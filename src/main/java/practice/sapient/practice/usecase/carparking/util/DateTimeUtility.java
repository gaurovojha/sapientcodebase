package practice.sapient.practice.usecase.carparking.util;

import java.util.Date;

public class DateTimeUtility {
	
	public static long calculateTimeDifference(Date entryTime, Date exitTime){
		long diff = entryTime.getTime() - exitTime.getTime();
		return diff;
	}

}
