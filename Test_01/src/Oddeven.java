import java.util.Scanner;

public class Oddeven {

	private int num;
	
	Oddeven(){
		
	}

	public void numchk(){
		enternum();
		oddevenchk(num);
	}
	
	private void enternum(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter Number: ");
		
		num = input.nextInt();
		
		
	}
	
	public void oddevenchk(int num){
		int num1;
		num1 = num;
		
		if (num1%2 == 1){
			System.out.println("Odd Number: " + num1);
		}else {
			System.out.println("Even Number: " + num1);
		}
	}
	
}
