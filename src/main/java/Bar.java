public class Bar {
	
	private Integer maxSeats;
	private Integer occupiedSeats;
	private Integer newClients;
	private String status;

	public String checkAvailability() {
		if ((this.getNewClients() + this.getOccupiedSeats()) > this.getMaxSeats()) {
			this.setStatus("Complet");
			return this.getStatus();
		}  else {
			this.setStatus("Places disponibles");
			return this.getStatus();
		}
	}

	public int getMaxSeats() {
		return maxSeats;
	}

	public void setMaxSeats(int maxSeats) {
		this.maxSeats = maxSeats;
	}

	public int getOccupiedSeats() {
		return occupiedSeats;
	}

	public void setOccupiedSeats(int occupiedSeats) {
		this.occupiedSeats = occupiedSeats;
	}

	public int getNewClients() {
		return newClients;
	}

	public void setNewClients(int newClients) {
		this.newClients = newClients;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	
	

}
