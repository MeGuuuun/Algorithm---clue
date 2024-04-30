import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
       
        int[] num = new int[n];
        
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        
        int sum = 0;
        int tmp = 0;
        
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++){
                    sum = num[i] + num[j] + num[k];
                    if(sum <=m && sum>tmp){
                        tmp = sum;
                    }
                }
            }
        }
        System.out.println(tmp);
    }
}