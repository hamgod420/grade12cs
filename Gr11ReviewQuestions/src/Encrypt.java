/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 *
 * 	Code a program which encrypts a line of code. The encryption
    specifications are as follows:

	first and last character of each string are exchanged.
	Middle characters of each string are shifted to the character two after it in the ASCII table (works for non-letters as well.)
	spaces are left alone
	careful with strings less than 3 characters
	
	Example:
	Input: Enter a line to be encrypted: Happy Days!
	Output: The encryption is: ycrrH !c{uD
 */
public class Encrypt {

	/**
	 * @param args
	 */
	
	//Encryption function
	public static String EncryptString(String str) {
		
		String sNew = "";//New string 
		
		sNew+=str.charAt(str.length()-1);//Adds last letter
		
		for(int i = 1;i<str.length()-1;i++) {//loops through middle letters
			char c = (char)(str.charAt(i)+2);//creates char value that is shifted by two
			sNew+=c;//adds char to string
		}
		
		sNew+=str.charAt(0);//adds first letter
		
		return sNew;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String line[] = in.nextLine().split(" ");//Splits input by spaces into array
		
		for(String str : line) {//loops through array
			System.out.print(EncryptString(str)+" ");//prints out each encrypted string
		}
	}

}
