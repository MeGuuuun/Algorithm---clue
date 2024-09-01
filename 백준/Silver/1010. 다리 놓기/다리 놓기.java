import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int[][] arr = new int[t][2];
        
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int result = 1;
            
            for(int j=0; j<n ; j++){
                result = result*(m-j)/(j+1);
            }
            
            System.out.println(result);
        }
        
    }
}