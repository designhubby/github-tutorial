/*(Checkerboard Pattern ofAsterisks) Write an application that uses only the output statements
System.out.print( "* " ); System.out.print( "" ); System.out.println();
to display the checkerboard pattern that follows. A System.out.println method call with no arguments causes the program to output a single newline character. [Hint: Repetition statements are required.]
*/

public class CheckerboardAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printpattern();
	}
	
	public static void printpattern(){
		for(int i = 0; i<4;i++){
			//pattern 1
			for(int j = 0; j < 8;j++){
				System.out.print("* ");
				
			}
			System.out.println();
			System.out.print(" ");
			for(int j = 0; j < 8;j++){
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}
