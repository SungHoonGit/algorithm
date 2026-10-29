import java.util.*;

class Solution {
    public int[][] solution(int n) {

        int[][] answer = new int[n][n];

        int row = 0;
        int col = 0;
        int dir = 0;

        for (int num = 1; num <= n * n; num++) {

            answer[row][col] = num;

            int nr = row + dr[dir];
            int nc = col + dc[dir];

            // 벽에 부딪히거나 이미 숫자가 있으면 방향 변경
            if (nr < 0 || nr >= n ||
                nc < 0 || nc >= n ||
                answer[nr][nc] != 0) {

                dir = (dir + 1) % 4;

                nr = row + dr[dir];
                nc = col + dc[dir];
            }

            row = nr;
            col = nc;
        }

        return answer;
    }

    int[] dr = {0, 1, 0, -1};
    int[] dc = {1, 0, -1, 0};
}