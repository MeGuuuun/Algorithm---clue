import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[2];
		
		int cycle=0;
		
		arr=toArr(n);
		
		while(true) {
			arr=newResult(arr);
			cycle++;
			if(isEqual(arr,n)) {
				break;
			}
		}
		System.out.println(+cycle);
		
	}
	public static int[] toArr(int n) {
		int arr[]=new int[2];
		if(n<10) {
			arr[0]=0;
			arr[1]=n;
			return arr;
		}
		arr[0]=n/10;
		arr[1]=n%10;
		return arr;
	}
	public static int[] newResult(int[] arr) {
		int[] result=new int[2];
		int sum=arr[0]+arr[1];
		
		if(sum>=10) {
			result[0]=arr[1];
			result[1]=sum%10;
			return result;
		}
		result[0]=arr[1];
		result[1]=sum;
		
		return result;
	}
	public static boolean isEqual(int[] arr, int n) {
		int temp=arr[0]*10+arr[1];
		if(temp==n) {
			return true;
		}
		return false;
	}

}
