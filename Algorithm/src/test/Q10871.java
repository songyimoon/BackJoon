package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Q10871 {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());	
		int A = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=1; i<=N; i++) {
			int X = Integer.parseInt(st.nextToken());
			if(X < A) {
				bw.write(X+" ");
			}		
		}
		bw.flush();
		br.close();
		bw.close();
	}
}