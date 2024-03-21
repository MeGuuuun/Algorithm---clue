import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        String str = sc.next();
        
        int num0cnt = 0;
        int num1cnt = 0;
        
        if(str.charAt(0)=='0') num0cnt++;
        else num1cnt++;
        
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                if(str.charAt(i)=='1') num1cnt++;
                else num0cnt++;
            }
        }
        System.out.println(Math.min(num0cnt, num1cnt));
    }
}