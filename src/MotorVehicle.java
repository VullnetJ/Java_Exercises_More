public	class MotorVehicle extends Vehicle{
	private String model;

	public MotorVehicle(String model) {
		super();
		this.model = model;
	}

	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public String toString() {
		return model ;
	}

}