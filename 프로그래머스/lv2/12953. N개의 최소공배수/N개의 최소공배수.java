// import java.math.BigInteger;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        // BigInteger gcd;
        // BigInteger lcm;
        for(int i=0; i< arr.length-1; i++) {
         // gcd = BigInteger.valueOf(arr[i+1]).gcd(BigInteger.valueOf(answer));  // 최대공약수 계산
         // lcm = BigInteger.valueOf(arr[i+1]).multiply(BigInteger.valueOf(answer)).divide(gcd);  // 최소공배수 계산            
         //   answer=lcm.intValue();
         answer = lcm(answer, arr[i+1]);
            
        }
        return answer;
    }
    
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    } // 최대공약수
    
    public int lcm(int a, int b) {
        int gcdValue = gcd(a, b);
        return (a * b) / gcdValue;
    } // 최소공배수
    
}
