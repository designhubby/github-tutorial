/*4.2 Find the Largest Number) The process of finding the largest value is used frequently in com-
puter applications. For example, a program that determines the winner of a sales contest would input
the number of units sold by each salesperson. The salesperson who sells the most units wins the con-
test. Write a pseudocode program, then a Java application that inputs a series of 10 integers and deter-
mines and prints the largest integer. Your program should use at least the following three variables:
a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
input and to determine when all 10 numbers have been processed).
b) number: The integer most recently input by the user.
c) largest: The largest number found so far.
*/
import java.util.Arrays;
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
			numbers[i] = rn.nextInt(99);
		}
		
		System.out.println("\nNumbers stored: ");
		for(int i : numbers){
			System.out.print(i);
		}
		
		System.out.println("Please enter 10 numberes separated by space: ");
		String tempString = "10 11 12 13 14 15 16 17 18 "; //input.nextLine();
		
		int currentdelimiterindex1 =0;
		int currentdelimiterindex2;
		
		for(int i = 0; i<9;i++){
			
			currentdelimiterindex2 = tempString.indexOf(" ", currentdelimiterindex1);
			//System.out.println("You Entered: "+ tempString.substring(currentdelimiterindex1, currentdelimiterindex2));
			numbers[i] = Integer.parseInt(tempString.substring(currentdelimiterindex1, currentdelimiterindex2));
			System.out.println("You Entered: "+ numbers[i]);
			
			currentdelimiterindex1 = currentdelimiterindex2 + 1;
			//currentdelimiterindex2 ++;
		}
		
		System.out.println("Last entered number was: " + numbers[8]);
		
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
		int temparrayindex = Arrays.asList(numbers).indexOf(maxnum);
		numbers[temparrayindex] = 0;
		
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
