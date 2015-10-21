import java.util.Scanner;


public class MinMaxInteger {

	
	
	MinMaxInteger(){
		
		
	}
	
	
	public void getMinMaxInteger(){
		
		Scanner input = new Scanner(System.in);
		
		int[] integer1 = new int[5];
		int num;
		int biggest_num =0;
		int smallest_num = 0;
		
		for (int i = 0; i<5; i++){
			System.out.println("Please enter number" + i);
			num = input.nextInt();
			integer1[i] = num;
			
		}
		
		for(int i = 0;i<5;i++){
			System.out.print("Your numbers are: " + integer1[i]);
			
		}
		 
		// Check for biggest number 
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				
				
				
				if (integer1[i] - integer1[j] >= 0 ){
					// integer1[i] still bigger 
					if(j == 4){
						biggest_num = integer1[i];
					}
				}else{
					// integer1[i] smaller
					
					break;//abort with integer1[i] checking
				}
			}
			
		}
		System.out.println("\nThe biggest number: " + biggest_num);
		
	
		//Check for smallest number
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				
				
				
				if (integer1[i] - integer1[j] <= 0 ){
					// integer1[i] still smaller 
					if(j == 4){
						smallest_num = integer1[i];
					}
				}else{
					// integer1[i] bigger
					
					break;//abort with integer1[i] checking
				}
			}
			
		}
		
		System.out.println("The smallest number: " + smallest_num);
	}
}
