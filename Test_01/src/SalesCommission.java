import java.util.Scanner;

public class SalesCommission {

	 //Input all items sold
		//one input of quantity per item
	//Calculate all the salary
		//sum the items
		//find the 9% of sum
		//add $200
	
	static double item1;
	static double item1cost = 239.99;
	
	static double item2;
	static double item2cost = 129.99;
	
	static double item3;
	static double item3cost = 99.95;
	
	static double commissionpercentage = 9;
	
	static double basesalary = 200;
	
	public static void inputInfo(){
		
		commissionpercentage = 9;
		basesalary = 200;
		Scanner input = new Scanner(System.in);
		System.out.println("\nInput Item 1: ");
		item1 = input.nextDouble();
		System.out.println("\nInput Item 2: ");
		item2 = input.nextDouble();
		System.out.println("\nInput Item 3: ");
		item3 = input.nextDouble();
		System.out.println("\nYour Commission is : " + commissionpercentage);
		System.out.println("Your Base Salary: " + basesalary);
		
		System.out.println("Your total pay is: "+ calcPay());
		
	}
	
	public static double  calcPay(){
		double totalpay;
		totalpay = ((item1*item1cost + item2*item2cost + item3*item3cost) *commissionpercentage *0.01) + basesalary;
		return totalpay;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesCommission.inputInfo();
	}
	
	

}
