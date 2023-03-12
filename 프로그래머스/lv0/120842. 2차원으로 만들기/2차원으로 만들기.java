import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int count = 0;
        for(int i=0; i<num_list.length/n; i++) {
            answer[i] = Arrays.copyOfRange(num_list, count+(n*i), n-count+(n*i));
        }
        return answer;
    }
}