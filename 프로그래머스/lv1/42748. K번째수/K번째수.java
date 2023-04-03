import java.util.Arrays;

class Solution {

    public int[] solution(int[] ar, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            int ed = commands[i][1];
            int st = commands[i][0];

            int[] temp = new int[ed - st + 1]; // 복사 배열 설정.
            for (int j = 0; j <= ed-st; j++) {
                temp[j] = ar[j + st - 1];
            } // 배열 복사.

            Arrays.sort(temp);

            answer[i] = temp[commands[i][2]-1];
        }

        return answer;

    }

}