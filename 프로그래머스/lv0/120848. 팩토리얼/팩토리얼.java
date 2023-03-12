class Solution {
    public int solution(int n) {
        int answer = 1;
        int check =1;
        while( answer<=n) {
            answer = answer*check;
            check++;
        }
        return check-2;
    }
}