import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i=0; i < A.length; i++) {
            answer += A[i]*B[A.length-1-i];
        }
        return answer;
    }
}