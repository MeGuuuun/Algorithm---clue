import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] score=new int[n];
		int max=0;
		for(int i=0; i<n; i++) {
			score[i]=sc.nextInt();
		}
		max=findMax(score);
		
		avg(convert(score,max));
	}
	
	static int findMax(int[] arr) {
		int max=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			if(max<arr[i]) max=arr[i];
		}
		return max;
	}
	
	static double[] convert(int[] arr, int max) {
		double[] convArr=new double[arr.length];
		for(int i=0; i<arr.length; i++) {
			convArr[i]=(double)arr[i]/max*100;
		}
		return convArr;
	}
	
	static void avg(double[] arr) {
		double sum=0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println(sum/arr.length);
	}

}