import java.util.*;

public class Solution {
    public int solution(int n) {
        String test = Integer.toString(n);
        char[] test2 = test.toCharArray();
        int answer = 0;
        for(char a : test2) {
            answer += a-48;
        }

        return answer;
    }
}