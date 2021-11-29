/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 *
 * Selection and repetition
 *
 * Write a program that reads a positive integer and then finds the smallest power of two
 * that is greater than or equal to the number that are read. For example, if the program reads the value 25, 
 * it should note that 32 = 25 is the smallest power of two greater than or equal to 25.
 */
public class LeastTwoPower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int iN = in.nextInt();
		
		int iPow = 0;//counter for exponent
		int iPowerOfTwo = 0;//value of exponent
		while(iPowerOfTwo < iN) {
			//while the power of 2 is less than the input we perform operations
			iPowerOfTwo = (int)Math.pow(2, iPow);//calculating powers of 2
			iPow+=1;//increases exponent until number is greater than input
		}
		System.out.println(iPowerOfTwo);
	}

}
