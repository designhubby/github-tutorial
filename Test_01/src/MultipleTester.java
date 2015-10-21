import java.util.Scanner;

public class MultipleTester {

	public MultipleTester(){
		
	}
	
	
	public void testMultiples(){
		
		String str_num;
		
		int space;
		
		int num1;
		int num2;
		int modulo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter 2 Numbers with Space in Between: ie [a b] ");
		
		str_num = input.nextLine();
		input.close();
		
		space = str_num.indexOf(" "); // IndexOf the Space
		
		num1 = Integer.parseInt(str_num.substring(0, space));
		
		num2 = Integer.parseInt(str_num.substring(space+1,str_num.length()));
		
		System.out.println("Your 2 Numbers: \n " + "Number 1: " + num1 + "\n Number 2: " + num2);
		
		modulo = num1%num2;
		System.out.println("The reminder is: " + modulo);
		
		if (modulo == 0){
			System.out.println("a is a multiple of b");
		}else{
			System.out.println("a is not a multiple of b");
			
		}
		
		
		
	}
}
