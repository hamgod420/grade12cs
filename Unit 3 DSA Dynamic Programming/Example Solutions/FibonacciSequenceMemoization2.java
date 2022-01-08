/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 *
 */
public class FibonacciSequenceMemoization2 {

  public static HashMap<Integer,Integer> memo = new HashMap<>();
  public static int operations = 1;
    //<n,fib(n)>
    public static int findFib(int n) {
		
		if(memo.containsKey(n)){
		    return memo.get(n);
		}
		if(n<=1) {
			f = n;
		}else{
            int f; = findFib(n-1)+findFib(n-2); 
            operations += 1;
            memo.put(n,f);
		}
		return f;
	}
	
	public static void main(String[] args) {
		
		System.out.println(findFib(10));
		System.out.println(operations);

	}

}
