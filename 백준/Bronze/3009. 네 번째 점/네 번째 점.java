import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        
        for(int i=0; i<3; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        int ansX = 0;
        int ansY = 0;
        
        if(x[0] == x[1]) {
            ansX = x[2];
        }else if(x[0] == x[2]){
            ansX = x[1];
        }else ansX = x[0];
        
        if(y[0] == y[1]) {
            ansY = y[2];
        }else if(y[0] == y[2]){
            ansY = y[1];
        }else ansY = y[0];
            
         System.out.println(ansX + " " + ansY);
        
    }
}