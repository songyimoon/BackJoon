package test;

import java.util.Scanner;

public class Q1110 {
	public static void main(String args[])  {
		 Scanner sc = new Scanner(System.in);
		  
		 int A = sc.nextInt(); 
		 sc.close();
		 
		 int cnt = 0;
		 int copy = A;
		 
		 while(true) {
			 A = ((A%10)*10) + (((A/10)+(A%10))%10); 
			 cnt++;
			 
			 if(copy==A) {
				 break;
			 }
		 }
		 System.out.println(cnt);
		 
	}
}