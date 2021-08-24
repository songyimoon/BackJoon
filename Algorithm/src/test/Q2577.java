package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 



public class Q2577 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine()); // 스트링으로 각각 A,B,C 받아주고, 그걸 parsing한다.
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		 
		String ABC = Integer.toString(A*B*C); // int값 3개를 곱한걸 다시 toString해서 String객체에 담아준다.
		
		int [] arr = new int [ABC.length()]; // arr에 큰 숫자를 다 쪼개서 배열로 담아줄것이다.
		 
		for(int i=0; i<arr.length; i++) { // 배열의 길이, 즉 곱한 숫자의 길이만큼 for문을 반복하면서
			arr[i] = Integer.parseInt(ABC.substring(i,i+1)); // 첫번째 배열 인자에는 ABC의 substring(1,2)를 넣어서 첫번째 인자를 가져온다. 두번째는 2,3 이 되므로 2번째 인자를 가져오게 될 것임.		
		} // 배열 각각의 인덱스에 자릿수에 맞는 값들이 들어갔을 것임.
		
		for(int i=0; i<10; i++) { // 0~9까지인 숫자, 총 10개 비교할 것이다.
			int count = 0;
			
			for(int j=0; j<arr.length; j++) { // i가 0일 때, count는 0이고, j는 0부터, 배열 안에 들어있는 모든 인자를 돌린다. (배열 내부 숫자를 i가 들어간 for문인 0~9랑 비교하는 것)
				if(i == arr[j]) { // i가 0일때, arr[0]~arr[9]까지의 모든 값을 비교해서 0일때마다 count를 ++하는것. 9까지 돌리면 i가 1일때, 다시 arr[0]부터 arr[9]까지 돌린다.
					count++;
				}
			}
			bw.write(count+"\n"); // 줄바꿈
		}
		  
		bw.flush();
	}	 
}