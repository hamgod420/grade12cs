/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 *
 */
public class BoundedKnapsack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int C = in.nextInt();//size of knapsack
		int N = in.nextInt();//num of items
		int v[]=new int[N];//value of each item
		int w[]=new int[N];//weight of each item
		
		for(int i = 0;i<N;i++) {
			v[i]=in.nextInt();
			w[i]=in.nextInt();
		}
		
		//BOUNDED KNAPSACK each item can only be chosen once
		
		//Overall problem: Find largest value of a combination of the N items that does not exceed the capacity C.
		
		/*Subproblems: What is the largest total value of a combination of the 
		first items for i = 0 to N
		that does not exceed the capacity of the bag j, for j = 0 to C */
		
		//DP Approach
		//Is there optimal substructure?
		
		//What does problem p(i,j) depend on?

		//What is the exact relationship between problem p(i,j) and it's subproblems?

		//What are the base cases?
		
		//Are there overlapping subproblems?
		
		//Provide an example of where overlapping subproblems occur
		
		int dp[][]=new int[N+1][C+1];
		
		for(int i = 1;i<=N;i++) {
			for(int j = 1;j<=C;j++) {
				if(j<w[i]) {
					dp[i][j]=dp[i-1][j];
					
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
				}
			}
		}
		System.out.println(dp[N][C]);
			
	}

}
