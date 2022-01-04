/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 *
 */
public class FibonacciSequenceDP {

	public static int operations = 1;
	
	public static long findFib(int n) {
		long dp[]=new long[n+2];//handles 0
		dp[0]=0;
		dp[1]=1;
		for(int i = 2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
			operations += 1;
		}
		//System.out.println(Arrays.toString(dp));
		return dp[n];
	}
	
	public static void main(String[] args) {
		
		System.out.println(findFib(10));
		System.out.println(operations);
	}

}
