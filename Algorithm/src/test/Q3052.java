package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3052 {
	public static void main(String args[]) throws IOException {

		boolean [] arr = new boolean[42]; // 42의 길이를 가진 boolean배열을 생성 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i=0; i<10; i++) {
			arr[Integer.parseInt(br.readLine())%42] = true; //42개 값 중에 나머지값으로 나온 것들이 true로 변경됨
		}
		int count = 0;
		for(boolean value : arr) {
			if(value) { // value가 true면
				count++;
			}
		}
		System.out.println(count);
	}
}