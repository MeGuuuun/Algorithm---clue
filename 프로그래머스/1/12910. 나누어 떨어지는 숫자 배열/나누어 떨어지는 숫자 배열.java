import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrList = new ArrayList<>();
            
        for(int num : arr){
            if(num%divisor==0){
                arrList.add(num);
            }
        }
        
        if(arrList.size()==0){
            int[] answer = {-1};
            return answer;
        }
        
        Collections.sort(arrList);
        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}