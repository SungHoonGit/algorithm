public class Solution {
    public int[] solution(String my_string) {
        int[] result = new int[52]; // 26개의 대문자와 26개의 소문자를 나타내기 위한 배열

        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // 대문자 알파벳인 경우
                result[c - 'A']++;
            } else if (Character.isLowerCase(c)) {
                // 소문자 알파벳인 경우
                result[c - 'a' + 26]++;
            }
        }

        return result;
    }
}
