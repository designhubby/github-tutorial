import java.util.Scanner;

public class SeparateDigits {

	
	public SeparateDigits(){
		
		
	}
	
	
	public void showDigits(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a 5 digit number.");
		
		
		int num;
		
		num = input.nextInt();
		
		
		int num5 = num/10000%10;
		int num4 = num/1000%10;
		int num3 = num/100%10;
		int num2 = num/10%10;
		int num1 = num/1%10;
		
		System.out.println("Numbers Separated: " + num5 + "   " + num4 + "   " + num3 + "   " + num2 + "   " + num1);
		 
		
	}
	
}
