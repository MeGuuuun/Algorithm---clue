class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        String[] arr = s.split("");
        
        for(String str : arr){
            idx = str.contains(" ") ? 0 : idx+1;
            answer += idx%2==0 ? str.toLowerCase() : str.toUpperCase();
        }
        
        return answer;
    }
}