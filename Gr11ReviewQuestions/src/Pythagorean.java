/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 *
 */
public class Pythagorean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int iMax = in.nextInt();
		
		int iCount = 1;//Counter used to decrement the max value if max value doesn't form a Pythagoreas triple
		
		while(true) {
			//infinite loop until Pythagoreas triple is found
			int iMaxSquare = iMax*iMax;//Square value of max
			
			//Nested for loop to check all possibilities for a and b until max
			for(int a = 0;a<iMax;a++) {
				for(int b = 0;b<iMax;b++) {
					int iAB = a*a + b*b;//value of the sum of square of a and b
					
					if(iAB == iMaxSquare) {//if the sum of squares match the value of max squared it forms a triple
						System.out.println(a + " " + b + " " + iMax);
						System.exit(0);//exit program
					}
				}
			}
			iMax-=iCount;//Max decreases if triple not found
			iCount+=1;//Count increased to decrease max
		}
		
	}

}
