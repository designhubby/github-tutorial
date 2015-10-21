
public class CheckerboardPattern {

	public CheckerboardPattern(){
		
	}
	
	
	public void displayChecker(){
		// i is for row even/odd
		// j is for column 
		// each i advance j by (8 times) 
		for (int i = 2; i < 12; i++){
			
			if (i%2 == 0){// to check if row is even or odd (EVEN)
				for(int j = 0; j<8;j++){
					
					System.out.print("*");
				
				
				
			}
				System.out.println("");
				
			}else{ //ODD
				System.out.print(" ");
				for(int j = 0; j<8;j++){
					
					System.out.print("*");
			}
				System.out.println("");

		}
		
	}
}
}