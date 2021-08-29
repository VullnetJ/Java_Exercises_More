public class Bicycle implements Ownable {
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
			return "Bicycle: " + name + " (value " + value + ".0 euros)" ;
		}


		
}