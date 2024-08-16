import java.lang.Math.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        answer = Math.pow((int)Math.sqrt(n), 2) == n ? (long)Math.pow(Math.sqrt(n)+1, 2) : -1;
        
        return answer;
    }
}