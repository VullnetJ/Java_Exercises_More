import java.io.PrintStream;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {
	private static String englishWord;
	private static String finnishWord;

	public ObjectsLanguageTranslationArrayList(String englishWord, String finnishWord) {
		super();
		ObjectsLanguageTranslationArrayList.englishWord = englishWord;
		ObjectsLanguageTranslationArrayList.finnishWord = finnishWord;
	}

	public static String getEnglishWord() {
		return englishWord;
	}

	public void setEnglishWord(String englishWord) {
		ObjectsLanguageTranslationArrayList.englishWord = englishWord;
	}

	public String getFinnishWord() {
		return finnishWord;
	}

	public void setFinnishWord(String finnishWord) {
		ObjectsLanguageTranslationArrayList.finnishWord = finnishWord;
	}

	@Override
	public String toString() {
		return englishWord + "\n" + finnishWord;
	}

	public static void main(String[] args) {

		ArrayList<ObjectsLanguageTranslationArrayList> arraylist = new ArrayList<>();

		System.out.print("=== Creating an English-Finnish dictionary (ok ends) ===");
		System.out.println("");

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Enter an English word: ");
			String english = scan.nextLine();

			if (english.equals("ok")) {
				break;
			}
			System.out.print("Enter a Finnish word: ");
			String finnish = scan.nextLine();
			arraylist.add(new ObjectsLanguageTranslationArrayList(english, finnish));

		}

		System.out.print("\n");
		System.out.println("=== English-Finnish translation service (quit ends) ===");

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter an English word: ");
			String eng = scan.nextLine();

			if (eng.equals("quit")) {
				System.out.println("Bye!");
				break;
			
			}

		if (getEnglishWord().equals(eng)) 
				System.out.println(finnishWord);
		 else 
				System.out.println("Unknown word");			
			}

		}	

	}
