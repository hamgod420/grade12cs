/**
 * 
 */
import java.util.*;
/**
 * @author hamgod
 * 
 *  Write a program that initialized an array of size 14 with user input and then reverses the order of the values in the 
 *  array using the specified methods:

	The first version uses two arrays. The original array is not changed. The second array gets the elements of the 
	first array in reversed order. The content of the second array is then printed in order.
	
	In the second version, there is only one array and its values are reversed
	and printed.
	
	Write a program that uses a 2D array to represents the marks of a set of tests for a class of students. 
	Your program should perform the following tasks

	a. Ask user to enter the number of students and the number of tests

	b. Ask user to enter each of the test marks for all students

	c. Calculate and output the average of each student

	d. Output the student (represented by the number) with the highest average

	e. List the students whose average is higher than the class average
 */
public class ArrayQuestion2 {

	/**
	 * @param args
	 * 
	 * Version 2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[14];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = in.nextInt();
		}
		
		int start;
		int end = arr.length-1;
		int temp = 0;
		for(start = 0;start<end+1;start++) {
			temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			end--;
		}
		System.out.println(Arrays.toString(arr));
		
			
	}

}
