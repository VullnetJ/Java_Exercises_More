
public class Car extends MotorVehicle implements Ownable {
	private int value;

	public Car(String string, int value) {
		super(string);
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		return "Car: "+ super.toString()  + " (value " + value + ".0 euros)";
	}
}
