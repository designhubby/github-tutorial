import java.util.Scanner;

public class ValueofNumber {
	int [] num = new int[6];
	
	public ValueofNumber(){
		
	}
	
	public void getValueofNumber(){
		
	
	
		
		inputNumber();
		determineValue();
		
		
		
		
		
	}
	
	public void inputNumber(){
		Scanner input = new Scanner(System.in);
		
		
		try {
			for(int i = 1; i<6;i++){
				System.out.println("Please enter the " + i + " number ");
				num[i] = input.nextInt();
				
			}
			
		} catch (Exception InputMismatchException) {
			System.out.println("Wrong type of character");
			InputMismatchException.printStackTrace();

			getValueofNumber();
			
		}
		
	}
	
	private void determineValue(){
		
		int negnum=0;
		int zeronum=0;
		int posnum=0;
		
		for (int i = 1;i<6;i++){
			
			if (num[i] <0){
				negnum++;
				
			}
			if(num[i]==0){
				zeronum++;
			}
			
			if(num[i]>0){
				posnum++;
			}
		}
		
		System.out.printf("Postive numbers: %d \n Zero Numbers: %d \n Negative Numbers: %d\n", posnum, zeronum, negnum);
		
	}
	
}
