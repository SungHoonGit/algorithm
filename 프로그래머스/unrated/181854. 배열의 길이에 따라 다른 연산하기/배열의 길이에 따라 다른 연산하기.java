import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] arr, int n) {
        int[] result = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 1 && i % 2 == 0) {  // 홀수 길이 배열, 짝수 인덱스
                result[i] += n;
            } else if (arr.length % 2 == 0 && i % 2 == 1) {  // 짝수 길이 배열, 홀수 인덱스
                result[i] += n;
            }
        }

        return result;
    }

}