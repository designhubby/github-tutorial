//4.29 (Square of Asterisks) Write an application that prompts the user to enter the size of the side
//of a square, then displays a hollow square of that size made of asterisks. Your program should work
//for squares of all side lengths between 1 and 20.
//
public class DrawSquare {

	public static void main(String[] args) {
		
		int squaresize = 11;
		
		// TODO Auto-generated method stub
		for(int i = 0; i < squaresize+1; i++){
			if(i != 0 & i!=squaresize){ //pattern for > 1st line AND < last line of square
				System.out.println("");
				for(int j=0; j<squaresize;j++){
					if(j!=0 & j!=squaresize-1){ //pattern for >1st space and < last space
						System.out.print(" ");	
					}else{
						System.out.print("*");
					}
					
				}
			}else{ // pattern for 1st line and last line of square
				System.out.println("");
				for(int j=0;j<squaresize;j++){ // generate inner characters
					if(j!=0 & j!=squaresize-1){ //pattern for >1st space and < last space
						System.out.print("*");	
					}else{ //pattern for 1st and last space
						System.out.print("*");
					}
				}
			}
			
		}
	}

}
