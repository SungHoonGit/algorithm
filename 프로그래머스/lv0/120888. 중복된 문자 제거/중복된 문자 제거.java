import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] test = my_string.split("");
        Set<String> set = new LinkedHashSet<>();
        for(String m : my_string.split("")) {
            set.add(m);
        }
        for (String i: set) {
            answer += i;
        }
        return answer;
    }
}