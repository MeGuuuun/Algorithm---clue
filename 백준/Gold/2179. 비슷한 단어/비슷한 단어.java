import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<String> arr = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            String str = sc.next();
            if(!arr.contains(str)) arr.add(str);
        }

        
        int s = 0;
        int t = 0;
        int max = 0;
        
        for(int i=0; i<n-1; i++){
            String str1 = arr.get(i);
            for(int j=i+1; j<n; j++){
                int cnt = 0;
                String str2 = arr.get(j);
                for(int k=0; k<Math.min(str1.length(), str2.length()); k++){
                    if(str1.charAt(k) == str2.charAt(k)) cnt++;
                    else break;
                }
                if(cnt > max){
                    s = i;
                    t = j;
                    max = cnt;
                }
            }
        }
        System.out.println(arr.get(s));
        System.out.println(arr.get(t));
    }
}