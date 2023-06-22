class Solution {
    // 숫자로 이루어진 문자열 t, p
    // t 에서 p와 길이가 같은 부분 문자열
    // 이 부분문자열이 나타내는 수가 p 가 나타내는 수보다 작거나 같은 것의 갯수 리턴

    public static int solution(String t, String p) {
        int len = p.length();
        long num = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i <= t.length() - len; i++) {
            if (Long.parseLong(t.substring(i, i + len)) <= num) {
                answer++;
            }
        }

        return answer;
    }
}