import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String[] arr = A.split("");
        int len = arr.length;
        
        for(int i=0;i<len;i++){
            String tmp = arr[len-1];
            for(int j=len;j>=2;j--){
                arr[j-1] = arr[j-2];
            }
            arr[0] = tmp;
            String str = String.join("",arr);
            if(str.equals(B)){
                answer = i+1;
                break;
            }
        }
        
        if(answer == 0) answer = -1;
        else if(answer == len) answer = 0;
        
        return answer;
    }
}