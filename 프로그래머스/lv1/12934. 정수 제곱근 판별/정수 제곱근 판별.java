class Solution {
    public long solution(long n) {
        long answer = new Double((Math.sqrt(n))).longValue(); // sqrt 제곱근을 이용 Double to Long

        if(Math.ceil(Math.sqrt(n)) == answer) {
            answer=(answer+1)*(answer+1);
        } else {
            answer = -1;
        }
        return answer;
    }
}