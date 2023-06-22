class Solution {
    public String solution(String s, String skip, int index) {
        String answer = ""; // 결과 문자열을 저장할 변수
        String alphabet = "abcdefghijklmnopqrstuvwxyz"; // 알파벳 문자열
        int idx; // 변환된 알파벳의 인덱스를 저장할 변수

        // skip 문자열에 포함된 알파벳은 alphabet 문자열에서 제거
        for(int i = 0; i < skip.length(); i++) {
            alphabet = alphabet.replace(Character.toString(skip.charAt(i)), "");
        }

        for(int i = 0; i < s.length(); i++) {
            idx = alphabet.indexOf(Character.toString(s.charAt(i))) + index; // 변환된 알파벳의 인덱스 계산
            answer += Character.toString(alphabet.charAt(idx % alphabet.length())); // 결과 문자열에 변환된 알파벳을 추가
        }

        return answer; // 최종 변환된 문자열을 반환
    }
}
