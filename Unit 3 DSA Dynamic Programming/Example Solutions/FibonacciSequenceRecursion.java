/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 *
 */
public class FibonacciSequenceRecursion {

    public static int operations = 0;//# of computations

	public static int findFib(int n) {
		if(n<=1) {
			return n;
		}else{
		    int f = findFib(n-1)+findFib(n-2);
		    operations += 1;
		    return f;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(findFib(10));
        	System.out.println(operations);
	}

}
