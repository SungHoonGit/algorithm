class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break; // 가장 작은 인덱스를 찾았으므로 반복문 종료
            }
        }

        return answer;
    }
}