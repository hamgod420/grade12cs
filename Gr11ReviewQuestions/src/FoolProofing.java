/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 *
 * Write a program that repeatedly asked for the numerator and divisor. For each set of data, 
 * the program prints out the result (quotient), or an informative error message if there is a 
 * problem (division by zero or poor input data). The program continues looping, even if there is a problem.
 * Exit the loop when data entered for the numerator start with characters “q” or “Q”. Don’t print out an
 * error message in this case. Don’t ask for the divisor if the user just asked to quit.
 */
public class FoolProofing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		while(true) {//infinite loop
			int numerator,divisor;
			System.out.print("Enter the numerator: ");
			String input1 = in.next();
			if(input1.equalsIgnoreCase("quit")) {//checks for quit command
				break;
			}
			try {
				//tries first input
				numerator = Integer.parseInt(input1);
				System.out.print("Enter the divisor: ");
				String input2 = in.next();
				try {
					//tries second input if it works
					divisor = Integer.parseInt(input2);
					//checks for 0
					if(divisor == 0) {
						System.out.println("Can't divide by 0.");
					}
					//Calculation
					double ans = numerator*1.0/divisor*1.0;
					
					System.out.println(ans);
					
				}catch(NumberFormatException e) {
					System.out.println("Thats not a number.");
				}
			}catch(NumberFormatException e) {
				System.out.println("Thats not a number.");
			}
			
			
		}
		
	}

}
