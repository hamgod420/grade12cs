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
public class ArrayQuestion3 {

	/**
	 * @param args
	 * 
	 * Version 2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int iStudents, iTests;
		
		System.out.println("Please enter the number of students");
		iStudents = in.nextInt();
		System.out.println("Please enter the number of tests");
		iTests = in.nextInt();
		int matrix[][] = new int[iStudents][iTests];
		for(int i = 0;i<iStudents;i++) {
			for(int j = 0;j<iTests;j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		
		double dMax = -1.0;
		int iIndexOfMax = 0;
		for(int i = 0;i<iStudents;i++) {
			double iAverage = 0;
			for(int j = 0;j<iTests;j++) {
				iAverage += matrix[i][j]; 
			}
			iAverage /= iTests*1.0;
			if(dMax < iAverage) {
				dMax = iAverage;
				iIndexOfMax = i+1;
			}
			System.out.println("Student "+(i+1)+" has an average of: "+iAverage);
		}
		
		System.out.println("Student "+iIndexOfMax+" has the highest average of: "+dMax);
		
			
	}

}
