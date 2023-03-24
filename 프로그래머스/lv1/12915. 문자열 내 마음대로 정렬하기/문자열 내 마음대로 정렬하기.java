import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for(int i=0; i<strings.length; i++) {
            answer[i]=strings[i].charAt(n)+strings[i];
        } // 문자열 앞으로 붙이기
        
        Arrays.sort(answer); // 정렬하기
        
        for(int i=0; i<strings.length; i++) {
            answer[i]=answer[i].substring(1);
        }// 앞자리 문자열 자르기
        
        return answer;
    }
}