import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        // System.out.println(Arrays.toString(score));
            for(int i = score.length-1;  i>=m-1; i-=m) {
                answer += score[i-m+1]*m;
            }
        return answer;
    }
}