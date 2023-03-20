import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        for(int i=0; i<score.length; i++) {
            int sum = score[i][0] + score[i][1];
            double avg = (double) sum / 2.0; // 평균값 구하기.

            int cnt = 0;
            for(int j=0; j<score.length; j++) {
                if(i != j && avg < ((double)score[j][0]+(double)score[j][1])/2.0) {
                    cnt++;
                }
            } // 겹치는 경우

            answer[i] = cnt+1;
        }

        return answer;
    }
}