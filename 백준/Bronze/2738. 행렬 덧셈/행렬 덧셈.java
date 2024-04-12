import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[(n*m)*2];
        
        for(int i=0; i< (n*m)*2; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int j=0; j<(n*m); j++){
            System.out.println(arr[j]+arr[j+(n*m)]);
        }
    }
}