import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner( System.in );
		 
		 int number1;
		 int number2;
		 int number3;
		 
		 int sum1;
		 
		 System.out.print("Please enter Number 1:  ");
		 
		 number1 = input.nextInt();
		 
		 System.out.print("Please enter Number 2:  ");
		 
		 number2 = input.nextInt();
		 
		 System.out.println("Please enter Number 3:  ");
		 number3 = input.nextInt();
		 
		 sum1 = number1 + number2;
		 
		 System.out.printf("%s%d\n","The sum is ", sum1);
		 
		 if (number1 == number2) 
			 System.out.printf("%d %s %d \n", number1, "==", number2);
		 if (number1 != number2)
			 System.out.printf("%d %s %d \n", number1, "!=",number2);
		 if (number1<number2)
			 System.out.printf("%d %s %d\n", number1," < ",number2);
		 if (number1>number2)
			 System.out.printf("%d %s %d\n", number1, " > ", number2);
		 
		 if (number1 > number2 && number1 > number3){
			 System.out.print(number1);
			 if (number2 > number3) 
				 {
				 System.out.print(number2 + " " + number3);
				 } else {
					 System.out.print(number3 + " " + number2);
				 };
		 }
		 if (number1 > number2 && number1 < number3){
			 System.out.print(number3 + " " + number1 + " " + number2);
			
		 }
		 if (number1<number2 && number1 < number3){
			 if(number2>number3){
				 System.out.print(number2 + " " + number3 + " "  + number1);
			 }else{
				 System.out.print(number3 + " " + number2 + " "  + number1);
			 }
			 
			 }
		 
		
		 
		 

	}

}
