class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int lmax = 0;
        int hmax = 0;
        for( int i = 0 ; i< sizes.length; i++ ){
            lmax = Math.max(Math.max(sizes[i][0], sizes[i][1]), lmax);
            hmax = Math.max(Math.min(sizes[i][0], sizes[i][1]), hmax);
        }

        answer = lmax*hmax;
        
        return answer;
    }
}