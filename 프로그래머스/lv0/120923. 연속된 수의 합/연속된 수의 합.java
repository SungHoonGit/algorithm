class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];
        int test = (2*total/num + 1 - num) / 2;
        for (int i=0; i<answer.length; i++) {
            answer[i] = test;
            test++;
        }// for end
        
        return answer;
    }
}