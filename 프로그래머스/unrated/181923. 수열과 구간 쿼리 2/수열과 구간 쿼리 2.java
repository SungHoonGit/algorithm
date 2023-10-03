import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int[] subArr = Arrays.copyOfRange(arr, s, e + 1);
            Arrays.sort(subArr);

            boolean found = false;
            for (int num : subArr) {
                if (num > k) {
                    result.add(num);
                    found = true;
                    break;
                }
            }

            if (!found) {
                result.add(-1);
            }
        }

        // List<Integer>를 int[] 배열로 변환
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}