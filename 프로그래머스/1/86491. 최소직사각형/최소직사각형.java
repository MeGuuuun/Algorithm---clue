class Solution {
    public int solution(int[][] sizes) {
        int len = sizes.length;
        
        int max_w = 0;
        int max_h = 0;
        
        for(int i=0; i<len; i++){
            max_w = Math.max(max_w, Math.max(sizes[i][0], sizes[i][1]));
            max_h = Math.max(max_h, Math.min(sizes[i][0], sizes[i][1]));
        }
        
        return max_w*max_h;
    }
}