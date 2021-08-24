package test;

import java.util.Scanner; 

public class Q2562 {
	public static void main(String args[]) {
		 int [] arr = new int [9];
		 int max = 0;
		 int index = 0;
		 Scanner scanner = new Scanner(System.in);
		 
		 for (int i=0; i<arr.length; i++) {
			 arr[i]= scanner.nextInt();
			 if(arr[i]>max) {
				 max = arr[i];
				 index = i;
			 }
		 }
		 System.out.println(max);
		 System.out.println(index + 1);
	}	 
}