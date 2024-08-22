class Solution {
    public String solution(String[] seoul) {
        int target = 0;
        
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                target = i;
            }
        }
        
        return "김서방은 "+target+"에 있다";
    }
}