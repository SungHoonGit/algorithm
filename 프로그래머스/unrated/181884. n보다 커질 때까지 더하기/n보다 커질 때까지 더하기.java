class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int count =0;
        while(true) {
            answer+= numbers[count++];
            if(answer>n) break;
        }
        return answer;
    }
}