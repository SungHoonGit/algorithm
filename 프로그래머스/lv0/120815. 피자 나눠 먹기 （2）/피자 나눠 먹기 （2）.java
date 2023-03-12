class Solution {
    public int solution(int n) {
        int answer = 0;
        int slice = 6;
        int answer2 = gcd(n,6);
        answer = n/answer2;

        return answer;
    }
    
    public static int gcd(int p, int q)
     {
        if (q == 0) return p;
        return gcd(q, p%q);
     }
}