/*
 * 4.38 (Enforcing Privacy with Cryptography) The explosive growth of Internet communications
and data storage on Internet-connected computers has greatly increased privacy concerns. The field
of cryptography is concerned with coding data to make it difficult (and hopefully—with the most
advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
simple scheme for encrypting and decrypting data. A company that wants to send data over the In-
ternet has asked you to write a program that will encrypt it so that it may be transmitted more se-
curely. All the data is transmitted as four-digit integers. Your application should read a four-digit
integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
encryption scheme) to form the original number. [Optional reading project: Research “public key
cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]

 */

//incomplete
public class Encrypter {

	static Integer input1 = 1234;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encrypt();
	}
	
	public static void encrypt(){
		String inputlength = input1.toString();
		String combine = "";
		for(int i = 0;i < inputlength.length(); i++){
			//double powerdown = (Math.pow(10, inputlength.length()-i));
			double powerup = (Math.pow(10, i));
			double inputpart = (input1/powerup)%10;
			Integer convert = (int) (inputpart + 7);
			combine =  Integer.toString(convert) + combine;
			Integer combineinteger= Integer.parseInt(combine);
			Integer div10 = combineinteger %10;
			System.out.println("Current number: " + (int) inputpart + " Plus 7 = " + convert + 
					" Combine String = " + combine + " Combine Integer Value: "+ combineinteger
					+ " Divide by 10 modulus " + div10);
			
		}
		
	}

}
