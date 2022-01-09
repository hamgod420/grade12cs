/**
 * 
 */

/**
 * @author hamgod
 *
 */
public class FactorialRecursion {

	public static long findFactorial(int n) {
		if(n<=1) {
			return 1;
		}
		return findFactorial(n-1)*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFactorial(5));
	}

}
