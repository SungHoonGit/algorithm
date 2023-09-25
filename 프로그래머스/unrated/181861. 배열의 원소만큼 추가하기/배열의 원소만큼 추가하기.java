class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        int count = 0;
        for(int i : arr) {
            size += i;
        }
        int[] answer = new int[size];
        for(int i : arr) {
            for(int j =0; j<i; j++) {
                answer[count++] = i;
            }
        }
        return answer;
    }
}