import java.util.Scanner;

public class CharacterValue {

		
	
	public void getCharacterValue(){
		
		Scanner input = new Scanner(System.in);
		int value;
		
		char character;
		
		System.out.println("Please Enter Character: ");
		character = input.next().charAt(0);
		
		
		value = (int)character;
				
		
	
		char testvalue;
		//testvalue = "A";
		System.out.printf("The Character %s has the value of %d", character, value );
		
		//System.out.println(Character.getNumericValue(testvalue));
	}
}
