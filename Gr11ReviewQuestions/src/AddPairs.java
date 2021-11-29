/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 *
 	Write a program that divides a number entered by the users into a set of two digits numbers 
 	(if the number has odd number of digits, the last number is only one digit), 
 	then output the sum of the set of numbers.


	Example:
	Input: 239403854
	Output: 209 (23+94+3+85+4)
 */
public class AddPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		String sNumberString = in.nextLine();
		
		int iTotalSum = 0;//sum of pairs
		
		if(sNumberString.length() % 2 == 0) {//if even
			for(int i = 0;i<sNumberString.length()-1;i+=2) {//loops through entire string with increments of 2
				
				int tens = 10*Integer.parseInt(sNumberString.substring(i,i+1));//tens digit
				int ones = Integer.parseInt(sNumberString.substring(i+1,i+2));//ones digit
				
				int sum = tens+ones;
				
				iTotalSum+=sum;//add to total sum
			}
		}else {//if odd
			for(int i = 0;i<sNumberString.length()-2;i+=2) {//loops through the string but only to the second last digit and then after we add the last digit
				int tens = 10*Integer.parseInt(sNumberString.substring(i,i+1));//value of substring for tens digit
				int ones = Integer.parseInt(sNumberString.substring(i+1,i+2));//value of substring for ones digit
				
				int sum = tens+ones;//creates 2 digit number
				
				iTotalSum+=sum;//adds to total
			}
			iTotalSum += Integer.parseInt(sNumberString.substring(sNumberString.length()-1,sNumberString.length()));//adds the last number
		}
		
		System.out.println(iTotalSum);
		
	}

}
