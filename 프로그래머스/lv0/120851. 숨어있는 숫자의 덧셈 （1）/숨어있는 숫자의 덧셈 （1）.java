import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[A-z]","");
        for(int i=0; i<my_string.length(); i++) {
            answer += my_string.charAt(i) -'0';
        }
        return answer;
    }
}