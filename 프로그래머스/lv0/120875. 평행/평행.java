class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        for(int i =0; i<dots.length;i++) {
                float temp =deg(dots[i],dots[(i+1)%4]);
                float temp2 =deg(dots[(i+2)%4],dots[(i+3)%4]);
                if(temp==temp2) {
                    answer = 1;
                } // if end
        } // for end
        return answer;
    }
    
    public static float deg(int[]a1,int[]a2) {
        float a,b;
            a= a1[0]-a2[0];
            b= a1[1]-a2[1];
        return b/a;
    }
}
