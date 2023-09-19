class Solution {
    public int solution(int a, int b) {
        int answer = Integer.parseInt(a+""+b);
        int answer2 = 2*a*b;
        if(answer<answer2) answer= answer2;
        return answer;
    }
}