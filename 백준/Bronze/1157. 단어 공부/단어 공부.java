import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine().toUpperCase();
        int[] ascii = new int[26];
        int max = -1;
        char ans =0;
        
        for(int i=0; i<str.length(); i++){
            ascii[str.charAt(i)-'A']++;
        }
        
        for(int i=0; i<26; i++){
            if(ascii[i] > max){
                max = ascii[i];
                ans = (char)(i+'A');
            }else if(max == ascii[i]){
                ans ='?';
            }
        }
        
        System.out.println(ans);
        
    }
}