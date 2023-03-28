class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m) , lcm(n,m)};
        return answer;
    } // solution end
    
    // 유클리드 호제법
    public int gcd(int a, int b) {
        while (b > 0)
        {
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    } // 최대공약수 구하기.
    
    public int lcm(int a, int b){
        return a * b / gcd(a,b);
    } // 최소 공배수 구하기.
    
}