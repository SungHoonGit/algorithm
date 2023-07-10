class Solution {

    public long solution(int n) {
        long answer = 0;
        if (n==1) {
          return 1;  
        }  else if (n==2) {
          return 2;  
        } 
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2;i<n;i++)  {
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        answer = dp[n-1];
        return answer;
    }

}
