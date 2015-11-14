import java.util.Random;
import java.util.Scanner;

public class NumberCompare {

	static int [] numbers = new int[9];
	static char[] characters = new char[9];
	static String[] stringnum = new String[9];
	static Random rn = new Random();
	
	public static void inputNumber(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please input 10 numbers: 	");
		
		for(int i = 0; i<9; i++){
			numbers[i] = rn.nextInt(10);
		}
		
		System.out.println("\nNumbers stored: ");
		for(int i : numbers){
			System.out.print(i);
		}
		
		
		int maxnum = 0;
		for(int i: numbers){
			for (int j: numbers){
				if (i>j){
					maxnum = i;
				}else{
					i=j;
				}
			}
		}
		System.out.println("\nPrint maxnum: " + maxnum);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberCompare.inputNumber();
	}

}
