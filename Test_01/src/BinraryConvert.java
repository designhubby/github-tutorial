import java.util.*;

public class BinraryConvert {

	static String userinput;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}
	
	
	public static void input(){
		
		//Scanner input = new Scanner(System.in);
		userinput = "1101"; //input.next();
		convert();
		
		
	}
	
	public static void convert(){
		int multiplier = 1;
		int total = 0;
		int j = userinput.length();
		for(int i = 0; i<userinput.length();i++){
			j = j-i;
			//System.out.println("Output raw input: " + userinput.substring(i, i+1)); // test input loop
			int inputint = Integer.parseInt(userinput.substring(j-1,j));
			//System.out.println("Output integer version of raw input: " + inputint);
			int result = inputint * multiplier;
			System.out.println(" inputint : " + inputint + " X " + multiplier + " = " + result);
			
			total = total + result;

			multiplier = multiplier * 2;
		}
		
		System.out.println("Total: " + total);
	}

}
