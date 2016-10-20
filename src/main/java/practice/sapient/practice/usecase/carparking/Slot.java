package practice.sapient.usecase.carparking;

public class Slot {
	
	// Unique slot identifier
	String slotId;
	
	// Slot Parking Status Indicator
	boolean occupied;
	
	
	/*
	 * Getters and setters
	 */
	
	
	public String getSlotId() {
		return slotId;
	}
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

}
