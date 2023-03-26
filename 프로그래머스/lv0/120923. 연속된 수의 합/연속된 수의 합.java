import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int hap=0;
        int[] answer = new int[num];
        
        for(int i=0;i<num;i++){
            hap += i;
        }
        int n = (total-hap)/num;
        
        for(int i=0;i<num;i++){
            answer[i] = n+i;
        }
            
        return answer;
    }
}