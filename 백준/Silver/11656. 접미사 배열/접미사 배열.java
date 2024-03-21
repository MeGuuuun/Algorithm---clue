import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        String[] arrStr = new String[len];
        
        for(int i=0; i<len; i++){
            arrStr[i] = str.substring(i, len);
        }
        
        Arrays.sort(arrStr);
        
        for(int j=0; j<len; j++){
            System.out.println(arrStr[j]);
        }
    }
}