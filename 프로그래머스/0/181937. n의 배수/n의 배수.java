class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        answer = num%n;
        
        return answer == 0 ? 1 : 0;
    }
}