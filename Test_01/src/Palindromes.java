
public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String charwhole = "112303211";
		
		String [] charset = new String[9];
		System.out.println("length " + charwhole.length());
		System.out.println("charwhole substring print: ");
		for(int i = 0; i<charwhole.length(); i++){ //charwhole substring print:
			System.out.print(charwhole.substring(i,i+1));
			charset[i] = charwhole.substring(i, i+1);
			
		}
		System.out.println("\nCharacters inside Array: ");
		for (int i = 0; i< charset.length;i++){
			System.out.print(charset[i]);
		}
		System.out.println("\n 9/2 = " + 9/2); //Test to see if division is floor function
		System.out.println("\n" + charset.length%2);
		System.out.println("\n" + charset.length);
		
		int maxlength = charset.length;
		int minlength = 0;
		boolean palindrome = true;
		for(int i =0;i<charset.length/2;i++){
			System.out.println("charset.length - i: " + (charset.length-i-1));
			System.out.println(charset[i] + " " + charset[(charset.length-i-1)]);
			if(charset[i].equals(charset[(charset.length-i-1)])){
				
//				System.out.println("Show work: " + charset[i] + "|||" + charset[(charset.length-i-1)]);
//				System.out.println("\nPalindrome");
			}else{
				palindrome = false;
//				System.out.println("Show work: " + charset[i] + "|||" + charset[(charset.length-i-1)]);
//				System.out.println("\n Not Palindrome");
			}
		}
		
		System.out.println(palindrome? "Palindrome" : "Not Palindrome");

	}

}
