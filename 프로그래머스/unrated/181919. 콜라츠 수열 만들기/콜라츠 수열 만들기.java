import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        // 콜라츠 수열을 저장할 리스트 생성
        List<Integer> collatzSequence = new ArrayList<>();
        collatzSequence.add(n); // 초기값 n을 리스트에 추가

        while (n != 1) {
            if (n % 2 == 0) {
                // 짝수인 경우, 2로 나누기
                n /= 2;
            } else {
                // 홀수인 경우, 3을 곱하고 1을 더하기
                n = 3 * n + 1;
            }
            collatzSequence.add(n); // 새로운 값을 리스트에 추가
        }

        // 리스트를 배열로 변환하여 반환
        int[] result = new int[collatzSequence.size()];
        for (int i = 0; i < collatzSequence.size(); i++) {
            result[i] = collatzSequence.get(i);
        }
        
        return result;            
    }
}