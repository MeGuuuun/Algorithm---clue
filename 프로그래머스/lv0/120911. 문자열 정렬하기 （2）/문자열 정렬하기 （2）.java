import java.util.*;

class Solution {
    public String solution(String my_string) {
        String str = my_string.toLowerCase();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String answer = new String(arr);
        return answer;
    }
}