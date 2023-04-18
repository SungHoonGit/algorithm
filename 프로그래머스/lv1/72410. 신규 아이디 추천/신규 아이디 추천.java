class Solution {
    public String solution(String new_id) {
        String answer = "";

        // 1~5 단계
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^\\w\\-_.]*", "");
        answer = answer.replaceAll("\\.{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        answer = answer.length() == 0 ? "a" : answer;

        // 6단계
        if (16 <= answer.length()) answer = answer.substring(0, 15).replaceAll("^[.]|[.]$", "");

        // 7단계
        answer = minLength(answer);

        return answer;
    }

    // 7단계
    private String minLength(String target) {
        // id가 2자 넘으면 반환
        if (2 < target.length()) return target;

        // id 마지막 문자를 끝에 추가
        target += target.charAt(target.length() - 1);

        // 재귀 호출로 위 작업 반복
        return minLength(target);
    }
}
