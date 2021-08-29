import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ObjectsFriendMapProgram {

	static class Friend {
		private String nickname;
		private String name;
		private String birthdate;

		public Friend(String nickname, String name, String birthdate) {
			super();
			this.nickname = nickname;
			this.name = name;
			this.birthdate = birthdate;
		}

		public String getNickname() {
			return nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBirthdate() {
			return birthdate;
		}

		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}

		@Override
		public String toString() {
			return nickname + "\n" + name + "\n" + birthdate;
		}

	}

	public static int getChoice() {
		System.out.println("1 = Add friend | 2 = Find friend | 3 = Delete friend | 4 = Print friends | 0 = Quit");
		int choiceNumber = 0;
		int looping = 1;

		for (int i = 0; i <= looping; i++) {
			try {				
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter choice: ");
				String choice = scan.nextLine();
				int choiceN = Integer.parseInt(choice);
				
				if (choiceN == 1 ) {
					choiceNumber = choiceN;
					looping = 0;
					return choiceNumber;

				} else if (choiceN == 3 ) {
					choiceNumber = choiceN;
					looping = 0;
					return choiceNumber;

				} else if ( choiceN== 3) {
					choiceNumber = choiceN;
					looping = 0;
					return choiceNumber;

				} else if (choiceN == 4) {
					choiceNumber = choiceN;
					looping = 0;
					return choiceNumber;
				} else if (choiceN == 0) {
					System.out.println("Please enter a number between 0 and zero 4 0" + "\n");
					looping = 0;
					choiceNumber = choiceN;
					return choiceNumber;			
				} 
				else {					
					System.out.println("Please enter a number between 0 5 and 4 n" + "\n");
					looping = 1;
					choiceNumber = choiceN;
					return choiceNumber;				
				}				
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number between 0 and 4 e" + "\n");
				System.out.println("1 = Add friend | 2 = Find friend | 3 = Delete friend | 4 = Print friends | 0 = Quit");
			}
		}
		return choiceNumber;

	}

	public static void main(String[] args) {
		int choice = getChoice();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		String date = "16/08/2016";

		// converting the String to LocalDate
		LocalDate localDate = LocalDate.parse(date, formatter);

		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> mapTwo = new HashMap<String, String>();

		Scanner scan = new Scanner(System.in);

		while (choice != 0) {

			if (choice == 1) {
				// add friends
				addFriend();
				System.out.print("\n");

				System.out.print("Enter nickname: ");
				String findNN = scan.nextLine();
				String checkNN = map.get(findNN);

				if (map.containsKey(findNN)) {
					System.out.println(findNN + " is already in use!");
					getChoice();
				}

				System.out.print("Enter name: ");
				String name = scan.nextLine();

				System.out.print("Enter birthdate (dd.mm.yyyy): ");
				String birthdate = scan.nextLine();

				map.put(findNN, name);
				mapTwo.put(name, birthdate);

			} else if (choice == 2) {
				findFriend();
				// find friends

				System.out.print("Enter nickname: ");
				String findNN = scan.nextLine();

				String checkNN = map.get(findNN);

				if (map.containsKey(findNN))

					for (Map.Entry<String, String> mapEntry : map.entrySet())
						for (Map.Entry<String, String> mapEntryTwo : mapTwo.entrySet()) {
							System.out.println(
									mapEntry.getKey() + ": " + mapEntry.getValue() + " " + mapEntryTwo.getValue());

						}

				else
					System.out.println(findNN + " not found!");

			} else if (choice == 3) {
				deleteFriend();
				// delete friends
				System.out.print("Enter nickname: ");
				String findNN = scan.nextLine();

				String checkNN = map.get(findNN);
				map.remove(checkNN);
				if (map.containsKey(checkNN)) {
					System.out.println(findNN + " deleted!");
				} else {
					System.out.println(findNN + " not found!");
				}
			} else if (choice == 4) {
				printFriends();
				// print friends

				for (Map.Entry<String, String> mapEntry : map.entrySet())
					for (Map.Entry<String, String> mapEntryTwo : mapTwo.entrySet()) {
						System.out
								.println(mapEntry.getKey() + ": " + mapEntry.getValue() + " " + mapEntryTwo.getValue());

					}
			}
			choice = getChoice();
		}
		System.out.println("Bye!");
	}

	private static void printFriends() {

	}

	private static void deleteFriend() {

	}

	private static void findFriend() {

	}

	private static void addFriend() {

	}
}
