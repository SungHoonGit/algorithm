class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while( n/a >0 ) {
            answer += n/a*b;
            n= n/a*b + n%a;
            System.out.print(answer); System.out.println(" "+n);
        }
        return answer;
    }
}
