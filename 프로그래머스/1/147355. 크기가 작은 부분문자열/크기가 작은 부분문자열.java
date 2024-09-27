class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        Long pLong = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-len ; i++){
            Long num = Long.parseLong(t.substring(i, i+len));
            if(num <= pLong) answer++;
        }
        
        return answer;
    }
}