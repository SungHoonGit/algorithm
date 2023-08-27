class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i; // 음수 값의 위치를 저장
                break;
            }
        }
        return answer;
    }
}