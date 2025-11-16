import java.util.HashMap;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Translator{
	public static void main(String args[]){
		HashMap<String, String> translateText = new HashMap<>();
		/*Tries the espanol-english.dat file and reads through the file if file exists
		else catchs a FileNotFoundException and prints out that an error occurred. */
		try(Scanner fileReader = new Scanner(new File("espanol-english.dat"))){
			/*While the file has an existing line, splits the line based off where the
			space is and adds to an array and then adds the indices to the hashMap. */
			while(fileReader.hasNextLine()){
				String line = fileReader.nextLine();
				String[] wordsFromFile = line.split(" ");
				translateText.put(wordsFromFile[0], wordsFromFile[1]);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
      		e.printStackTrace();
    	}
		System.out.println(translateText);
		/*Tries the translateMe.in file and reads through the file if the file
		exists or else catches a FileNotFoundException and prints out that an 
		error occurred. */
		try(Scanner secondFileReader = new Scanner(new File("translateMe.in"))){
			/*While the file has an existing line splits the line based off of where
			space is and adds it to the array and then iterates through array.*/
			while(secondFileReader.hasNextLine()){
				String lineFromFile = secondFileReader.nextLine();
				String[] wordsFromSecondFile = lineFromFile.split(" ");
				/*Goes through the array with the translate word and finds the translation for each
				index in the hashmap and prints it out to the console. */
				for(int i = 0; i < wordsFromSecondFile.length; i++){
					System.out.print(translateText.get((wordsFromSecondFile[i])) + " ");
				}
				System.out.println();
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
      		e.printStackTrace();
    	}
	}
}