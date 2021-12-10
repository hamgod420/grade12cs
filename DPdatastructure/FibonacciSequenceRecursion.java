/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 *
 */
public class FibonacciSequenceRecursion {

	public static int findFib(int n) {
		if(n<=1) {
			return n;
		}
		return findFib(n-1)+findFib(n-2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(findFib(3));

	}

}
