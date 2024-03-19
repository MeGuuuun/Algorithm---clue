import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int top = -1;
        int k = sc.nextInt();
        int[] arr = new int[k];
        
        for(int i=0; i<k; i++){
            int num = sc.nextInt();
            
            if(num !=0 ) {
                top++;
                arr[top] = num;
            }else {
                top--;
            }
        }
        
        int result = 0;
        
        for(int i=0; i<=top; i++) {
            result += arr[i];    
        }
        
        System.out.println(result);
        
        
    }
}