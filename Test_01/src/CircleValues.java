import java.util.Scanner;

public class CircleValues {

	
	
	public CircleValues(){
		
		
	}
	
	
	public void showCircleValues(){
		
		Scanner input = new Scanner(System.in);
		
		int radius;
		
		System.out.println("Please enter radius: ");
		
		radius = input.nextInt();
		
		calcCircleValues(radius);
		
	}
	
	private void calcCircleValues(int radius){
		
		int radius1 = radius;
		double diameter = 2*radius1;
		double circumference = 2*Math.PI*radius1;
		double area = Math.PI*(radius1*radius1);
		
		
		System.out.printf("%s%d\n%s%d\n%s%f\n%s%f\n", "Radius: ", radius1, "Diameter: ", 2*radius1,"Circumference: ", 2*Math.PI*radius1,"Area: ", Math.PI*(radius1*radius1));
		
		
		
	}
	
}
