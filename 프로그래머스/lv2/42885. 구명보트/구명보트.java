import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int left = 0;  // 앞쪽 포인터
        int right = people.length - 1;  // 뒤쪽 포인터

        while (left <= right) {
            // 앞쪽 포인터와 뒤쪽 포인터의 합이 limit보다 작거나 같으면 두 개의 요소를 제거
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            }
            // 그렇지 않으면 뒤쪽 포인터만 이동하여 한 개의 요소를 제거
            else {
                right--;
            }
            answer++;  // 제거한 요소의 개수 증가
        }

        return answer;
    }
}
