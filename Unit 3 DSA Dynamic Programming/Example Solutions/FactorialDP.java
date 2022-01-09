/**
 * 
 */

/**
 * @author hamgod
 *
 */
public class FactorialDP {

	public static long findFactorial(int n) {
		int dp[]=new int[n+1];
		if(n == 0){
		    return 1;    
		}
		dp[1]=1;
		for(int i = 2;i<=n;i++) {
			dp[i]=dp[i-1]*i;
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFactorial(5));
	}

}
