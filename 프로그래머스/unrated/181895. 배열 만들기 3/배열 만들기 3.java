import java.util.ArrayList;
import java.util.List;


class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();

        for (int[] interval : intervals) {
            int a = interval[0];
            int b = interval[1];

            for (int i = a; i <= b; i++) {
                result.add(arr[i]);
            }
        }

        // List를 배열로 변환
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}