import java.util.Scanner;

public class BmiCalc {
	
	public BmiCalc(){
	
		
	}
	
	public void getBmi(){
		
		Scanner input = new Scanner(System.in);
		int weight;
		int height;
		double bmi;
		String status = null;
		
		System.out.println("Please input Weight in Kilograms: ");
		weight = input.nextInt();
		
		System.out.println("Please input Height in Meters");
		height = input.nextInt();
		
		bmi = weight/(Math.pow(height, 2));
		
		if(bmi >0){
			status = "Underweight";
		}
		if(bmi >= 18.5){
			status = "Normal";
		}
		if(bmi >=25){
			status = "Overweight";
		}
		if(bmi >=30){
			status = "Obese";
		}
		
		System.out.println("Your BMI is: " + bmi + "\nIt is " + status);
		
	}
	
}
