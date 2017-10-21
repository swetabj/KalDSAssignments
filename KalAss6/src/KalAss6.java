/*Given an array of numbers split the array into 2 where one array contains the sum of n-1 numbers
 * and the other array with all the n-1 elements
 * */

import java.util.*;

public class KalAss6 {
	public static void main(String args[]) {
		int size = 0;
		float [] a = null;
		
		KalAss6 solution = new KalAss6();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		size = s.nextInt();
		
		a = new float [size];
		System.out.println("Enter the array");
		for(int i = 0;i < size;i++) {
			a[i] = s.nextFloat();
		}
		
		solution.problemSolutionLogic(size,a);
		
		s.close();
	}
	
	private void problemSolutionLogic(int size,float [] a) {
		float [] a1 = new float [size];
		float [] a2 = new float [1];
		float sum = (float) 0.0;
		float reqNum = (float) 0.0;
		Boolean found = false;
		
		//calculat the sum
		for(int i = 0;i<size;i++) {
			sum = sum + a[i];
		}
		reqNum = sum/2;
		
		System.out.println("Required num: " + reqNum);
		
		//Check and divide the array into 2 such that one array have all the elements till n-1 and 
		//other array contains the element of the array which is the sum of the elements of n-1 elements
		
		for(int i = 0,j = 0; i< size; i++,j++) {
			if(a[i]==reqNum && !found) {
				a2[0] = a[i];
				j--;
				found = true;
			}
			else {
			a1[j] = a[i];
			}
		}
		
	if(found){
		System.out.println("First array:");
//		printArray(a1); 
		for(int i = 0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		System.out.println("Second array:");
//		printArray(a2); 
		for(int i = 0;i<a2.length;i++) {
			System.out.println(a2[i]);
		}
	}
	else {
		System.out.println("The array cannot be divided into 2 according to the given condition");
	}
	
}
	
	private void printArray(int [] a) {
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
}
