class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int a ;
        for(int i=0; i<absolutes.length; i++) {
            if(signs[i]) { a = +1; } else { a = -1; }
            answer += absolutes[i]*a;
        }
        return answer;
    }
}