import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c=Integer.parseInt(br.readLine());
		
		for(int i=0; i<c; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] score=new int[n];
			int sum=0;
			int count =0;
			double avg=0;
			
			for(int k=0; k<n; k++) {
				score[k]=Integer.parseInt(st.nextToken());
				sum+=score[k];
				
			}
			avg=(double)sum/n;
			
			for(int j=0; j<n;j++) {
				if(score[j]>avg) {
					count++;
				}
			}
			double rate=(double)count/n*100.0;
			System.out.printf("%.3f%%\n",rate);
		}
	}

}