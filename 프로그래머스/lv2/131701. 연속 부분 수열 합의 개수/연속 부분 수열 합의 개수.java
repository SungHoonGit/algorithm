import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int solution(int[] elements) {
        Set<Integer> ans = new HashSet<>();

        int n = elements.length;
        for (int length = 1; length <= n; length++) { // 길이가 1 ~ n 까지
            for (int start = 0; start < n; start++) { //
                int sum = 0;
                for (int i = 0; i < length; i++) {
                    int index = (start + i) % n; // 인덱스를 배열 길이로 나눈 나머지를 사용하여 원형 배열처럼 처리
                    sum += elements[index];
                    // System.out.print(elements[index] + "  ");
                }
                ans.add(sum);
                // System.out.println(sum);
            }
        }// for end
        // System.out.println(ans);
        return ans.size();
    }
}
