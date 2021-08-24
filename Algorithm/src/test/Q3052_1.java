package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet; 

public class Q3052_1 {
	public static void main(String args[]) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			hashSet.add(Integer.parseInt(br.readLine()) % 42);
		} 
		System.out.println(hashSet.size());
	}
}