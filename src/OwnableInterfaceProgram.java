
public class OwnableInterfaceProgram {

	static class Bicycle implements Ownable {
		private String name;
		private int value;

		public Bicycle(String name, int value) {
			super();
			this.setName(name);
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Bicycle: " + name + " (value " + value + ".0 euros)";
		}

	}

	static class Car extends MotorVehicle implements Ownable {
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
			return "Car: " + super.toString() + " (value " + value + ".0 euros)";
		}
	}

	static class MotorVehicle extends Vehicle {
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
			return model;
		}

	}

	static public interface Ownable {

		double getValue();

	}

	static class PublicBus extends MotorVehicle {

		private String lineNumber;

		public PublicBus(String model, String lineNumber) {
			super(model);
			this.lineNumber = lineNumber;
		}

		public String getLineNumber() {
			return lineNumber;
		}

		public void setLineNumber(String lineNumber) {
			this.lineNumber = lineNumber;
		}

		public String toString() {
			return "Bus: " + super.toString() + " (line " + lineNumber + ")";
		}

	}

	static public class Vehicle {

		public Vehicle() {

		}

	}

	public static void main(String[] args) {

		Car car = new Car("VW Golf", 5000);
		Bicycle bike1 = new Bicycle("Colnago C50", 520);
		Bicycle bike2 = new Bicycle("Trek 9500", 340);
		PublicBus bus1 = new PublicBus("Ebusco Coach", "10");
		PublicBus bus2 = new PublicBus("Volvo Coach", "11");

		MotorVehicle[] motorVehicles = { car, bus1, bus2 };
		Ownable[] myOwnVehicles = { car, bike1, bike2 };
		double totalValue = 0;

		System.out.println("=== All motor vehicles ===");
		for (MotorVehicle vehicle : motorVehicles) {
			System.out.println(vehicle);
		}

		System.out.println("\n=== My own vehicles ===");
		for (Ownable ownVehicle : myOwnVehicles) {
			System.out.println(ownVehicle);
			totalValue += (ownVehicle).getValue();
		}
		System.out.println("-------------------------");
		System.out.println("The total value is " + totalValue + " euros.");
	}

}
