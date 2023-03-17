import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        String answers =my_string.toLowerCase(); // 소문자로 전부 변경.
        String[] test = answers.split("");
        Arrays.sort(test); // 배열을 크기별로 정렬
        for(String i : test ) {
            answer += i;
        }
         
        return answer;
    }
}