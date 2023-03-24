import java.lang.Math;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int sm = Math.min(a,b);
        int bg = Math.max(a,b);

        for (int i =sm; i<=bg; i++) {
            answer += i;
        }
        
        return answer;
    }
}