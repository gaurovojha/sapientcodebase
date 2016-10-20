package practice.sapient.practice.usecase.carparking;

import java.util.Date;

public class TimeTrack {
	
	// Vehicle Entry Time
	Date entryTime;
	
	// Vehicle Exit Time (current system time)
	Date exitTime;
	
	
	
	/*
	 * Getter and setters
	 */
	
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	public Date getExitTime() {
		return exitTime;
	}
	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}

}
