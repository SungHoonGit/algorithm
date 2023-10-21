import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        ArrayList<String> numbers = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            String subStr = my_string.substring(i); // i부터 끝까지의 부분 문자열 추출
            numbers.add(subStr);
        }
        
        Collections.sort(numbers); // ArrayList를 오름차순으로 정렬

        // 정렬된 결과를 문자열 배열에 저장
        answer = new String[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }        
        
        return answer;
    }
}