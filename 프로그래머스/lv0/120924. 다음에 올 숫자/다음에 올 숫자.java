class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        //등차수열 확인
        if(common[1]-common[0] == common[2]-common[1])
            return answer = common[common.length-1] + (common[1]-common[0]);
        //등비수열 
        else
            return answer = common[common.length-1] * (common[1]/common[0]);
    }
}
