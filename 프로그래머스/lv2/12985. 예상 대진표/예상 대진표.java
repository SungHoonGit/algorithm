class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        while(n>=2) {
            a = (a+1)/2;
            b = (b+1)/2;
            // System.out.println(a+", "+b+","+answer);
            if(a==b) break;
            answer ++;
            
        }

        return answer;
    }
}