/*(Printing the DecimalEquivalent ofa BinaryNumber) Write an application that inputs an integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent. [Hint: Use the remainder and division operators to pick offthe binary number’s digits one at a time, from right to left. In the decimal number system, the rightmost digit has a positional value of 1 and the next digit to the left a positional value of10, then 100, then 1000, and so on. The decimal number 234 canbeinterpreted as 4*1 +3*10+2*100. In thebinarynumbersystem, therightmost digithas a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so on. Thedecimal equivalent ofbinary 1101 is 1 * 1+ 0*2+ 1*4 +1*8, or 1 +0+ 4+ 8or, 13.]
*/
import java.util.*;

public class BinraryConvert {

	static String userinput;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}
	
	
	public static void input(){
		boolean inputcontinue = true;
		Scanner input = new Scanner(System.in);
		userinput = "110111001"; //input.next();
		while (inputcontinue){
			System.out.println("Please input binary sequence: ");
			userinput = input.next();
			
			if (verifyinput(userinput)){
				inputcontinue = false;
				convert();
			}else{
				System.out.println("Wrong input type.");
			}
		}
		
		
		
	}
	
	public static boolean verifyinput(String userinput){
		
		try{
			Integer.parseInt(userinput);
		}
		catch(NumberFormatException e){
			return false;
		}
		return true;
		
		
	}
	
	public static void convert(){
		int multiplier = 1;
		int total = 0;
		int j = userinput.length();
		//System.out.println(userinput.length());
		for(int i = 0; i<userinput.length();i++){
			
			System.out.print("i = " + i + "||  j = " + j + "   ||||  ");
			//System.out.println("Output raw input: " + userinput.substring(i, i+1)); // test input loop
			int inputint = Integer.parseInt(userinput.substring(j-1,j));
			//System.out.println("Output integer version of raw input: " + inputint);
			int result = inputint * multiplier;
			System.out.println(" inputint : " + inputint + " X " + multiplier + " = " + result);
			j -- ;
			total = total + result;
			
			multiplier = multiplier * 2;
		}
		
		System.out.println("base 10: " + total);
	}

}
