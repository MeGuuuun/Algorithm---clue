import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList();
        int len = my_str.length();
        
        for(int i=0;i<len/n;i++){
                answer.add(my_str.substring((n*i), (n*(i+1))));
            }
        
        if((len%n)!=0){
            answer.add(my_str.substring((len/n)*n));
        }
        return answer.toArray(new String[0]);
    }
}