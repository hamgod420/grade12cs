/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 *
 */
public class FibonacciSequenceMemoization {

    public static int memo[] = new int[1000001];//Memoization array
    public static int operations = 0;//# of computations
	public static int findFib(int n) {
	    if(memo[n]!=0){
	        return memo[n];
	    }
		if(n<=1) {
			return n;
		}else{
		    int f = findFib(n-1)+findFib(n-2);
		    operations += 1;
		    memo[n] = f;
		    return f;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(findFib(10));
		System.out.println(operations);

	}

}
