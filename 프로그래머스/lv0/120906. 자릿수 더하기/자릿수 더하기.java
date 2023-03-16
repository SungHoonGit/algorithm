
class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] test = Integer.toString(n).split(""); // 문자열의 배열로 변환

        for(String ad : test) {
            answer += Integer.parseInt(ad); // 인트로 변형
        }

        return answer;
    }
}