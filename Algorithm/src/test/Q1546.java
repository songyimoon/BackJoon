package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {
	public static void main(String args[]) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int [] arr = new int[num];
		
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = arr[0]; // 10 20 30
		int sum = 0;
		for(int i=0; i<3; i++) {
			if(max < arr[i]) {
				max = arr[i];
				arr[i]=(arr[i]/max)*100;
				sum += arr[i];
			}
		}// 다시
	 
		
		
		System.out.println(sum);
		
		
	}
}