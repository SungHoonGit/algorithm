class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        int i = 0;
        for( ; start <= end; start++) {
            answer[i++]=start;
        } // for end
        return answer;
    }
}