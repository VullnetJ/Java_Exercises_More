import java.util.Scanner;

public class ObjectsTimePeriodProgram {

	static class TimePeriod {
		private int hours;
		private int minutes;

		public TimePeriod(int hours, int minutes) {
			super();
			this.hours = hours;
			this.minutes = minutes;
		}

		public TimePeriod() {
			// TODO Auto-generated constructor stub
		}

		public int getHours() {
			return hours;
		}

		public void setHour(int hours) {
			this.hours = hours;
		}

		public int getMinutes() {
			return minutes;
		}

		public void setMinutes(int minutes) {
			this.minutes = minutes;
		}

		public void addHours(int hoursToAdd) {
			if (hoursToAdd >= 0 && hoursToAdd < 100) {
				if (hours < 99) {
					hours = hours + hoursToAdd;
				} else if (hours > 100) {
					hours = 0;
					minutes = 0;
				}
			}
		}

		public void addMinutes(int minutesToAdd) {

			if (minutesToAdd >= 0 && minutesToAdd < 99) {
				if (hours == 99 && minutes == 50) {
					hours = 99;
					minutes = 50;

				} else if ((minutes = minutes + minutesToAdd) > 59) {
					minutes = 60 % minutesToAdd;
					hours++;
				}

			}
		}

		public String toString() {
			return hours + " h " + minutes + " min";
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		TimePeriod period = new TimePeriod();

		System.out.println(period);

		for (int i = 1; i <= 2; i++) {
			System.out.print("Enter hours to add: ");
			int hours = Integer.parseInt(input.nextLine());

			System.out.print("Enter minutes to add: ");
			int minutes = Integer.parseInt(input.nextLine());

			period.addHours(hours);
			period.addMinutes(minutes);

			System.out.println(period);
			System.out.println();
		}

		input.close();
	}

}
