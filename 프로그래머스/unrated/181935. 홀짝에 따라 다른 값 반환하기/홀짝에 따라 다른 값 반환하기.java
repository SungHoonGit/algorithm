class Solution {
    public int solution(int n) {
        int answer = 0;
        int test = 1; 
        if(n%2==0) test=2;
        for(int i=test; i<=n; i+=2) {
            if(test==2) answer += i*i;
            else answer += i;   
        }
        return answer;
    }
}