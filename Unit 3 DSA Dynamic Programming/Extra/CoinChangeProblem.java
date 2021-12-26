/**
 * 
 */

/**
 * @author hamgod
 *
 */
public class CoinChangeProblem {

	/**
	 * @param args
	 */
	public static int count( int S[], int m, int n )
	{
	    int table[]=new int[n+1];
	    table[0] = 1;
	    for(int i=0; i<m; i++) {
	        for(int j=S[i]; j<=n; j++) {
	            table[j] += table[j-S[i]];
	        }
	    }
	    return table[n];
	}
	public static int countRecursion(int S[],int m,int n) {
		if(S[m]==0) {
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		int N = 4;//sum
		int arr[] = {1,2,3};//assume infinite supply of each value
		int M = arr.length;
		
		System.out.println(count(arr,M,N));
		
	}

}
