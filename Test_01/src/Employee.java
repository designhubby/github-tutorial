import java.util.Scanner;

public class Employee {

	String fname;
	String lname;
	double salary;
	
	public Employee(){
		fname = null;
		lname = null;
		salary = 0;
		
	}
	
	public void setfname(String fname1){
		fname = fname1;
	}
	
	public String getfname(){
		return fname;
	}
	
	public void setlname(String lname1){
		lname = lname1;
	}
	
	public String getlname(){
		return lname;
	}
	
	public void setSalary(double salary1){
		if(salary1 >0){
			salary= salary1;
		}
		
		
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void increaseSalary(double percentincrease){
		
		setSalary((1+(percentincrease/100))*(getSalary()));
	
	}
	
	public void testseq(){
		System.out.println("Enter Fname: ");
		Scanner input = new Scanner(System.in);
		setfname(input.nextLine());
		System.out.println("Enter Lname: ");
		setlname(input.nextLine());
		System.out.println("Enter Salary: ");
		setSalary(input.nextDouble());
		

		System.out.printf("\nFname %s Lname %s Salary %.2f", getfname(),getlname(),getSalary());
		
		System.out.println("\nIncrease Salary: ");
		increaseSalary(input.nextInt());
		
		System.out.printf("\n After Increase: Fname %s Lname %s Salary %.2f", getfname(),getlname(),getSalary());
		input.close();
		
	}
	
	
}
