import java.util.Arrays;
import java.util.Collections;


class Solution {
    public String solution(String s) {
        String[] S = s.split("");
         Arrays.sort(S, Collections.reverseOrder()); // 내림차순
        String answer = "";
        for(String add : S) {
            answer += add;
        } 
        
        return answer;
    }
}