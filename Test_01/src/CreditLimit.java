import java.util.Scanner;
/*
 * a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
 */
public class CreditLimit {
	
	
	public static void main(String[] args){
		CreditLimit.inputAcctinfo();
	}
	//input account and balance information:
	public static void inputAcctinfo(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n Please input Account Number: ");
		int acctnum = input.nextInt();
		System.out.println("\nPlease input Beginning Month Balance: ");
		double bal_1 = input.nextDouble();
		System.out.println("Please enter the total $$ of item debted this month: ");
		double month_debt = input.nextDouble();
		System.out.println("Please enter the total $$ credit this month: ");
		double month_credit = input.nextDouble();
		System.out.println("Please input the total balance allowed for the month: ");
		double month_credit_limit = input.nextDouble();
		calcResults(acctnum, bal_1, month_debt, month_credit, month_credit_limit);
		
	}
	//
	public static void calcResults(int acctnum, double bal_1, double month_debt, double month_credit, double month_credit_limit){
		double bal_result = bal_1-month_debt+month_credit;
		boolean credit_exceeded = false;
		if(bal_result>month_credit_limit ){
			credit_exceeded = true;
		}
		
		System.out.println("\nYour Account Number is : " + acctnum	+ 
							"\nYour Beginning Monthly Balance is : " + bal_1 +
							"\nYour Total Debited: " + month_debt + 
							"\nYour total $$ credit: " + month_credit + 
							"\nYour total balance allowed this month: " + month_credit_limit + 
							"\nYour Balance Result: " + bal_result + 
							"\nYour Status Exceeded: " + credit_exceeded);
		
		
		
	}
}
