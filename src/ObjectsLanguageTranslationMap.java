
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ObjectsLanguageTranslationMap {
	private static String englishWord;
	private static String finnishWord;


	public ObjectsLanguageTranslationMap(String englishWord, String finnishWord) {
		ObjectsLanguageTranslationMap.englishWord = englishWord;
		ObjectsLanguageTranslationMap.finnishWord = finnishWord;
	}



	public String getEnglishWord() {
		return englishWord;
	}



	public void setEnglishWord(String englishWord) {
		ObjectsLanguageTranslationMap.englishWord = englishWord;
	}



	public String getFinnishWord() {
		return finnishWord;
	}



	public void setFinnishWord(String finnishWord) {
		ObjectsLanguageTranslationMap.finnishWord = finnishWord;
	}


	@Override
	public String toString() {
		return englishWord + "\n" + finnishWord;
	}



	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
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
			map.put(english, finnish);

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
		
		String val =map.get(eng);		
		if (map.containsKey(eng)) 
		System.out.println(val);
		
		 else 
				System.out.println("Unknown word");			
			}

		}	

	}