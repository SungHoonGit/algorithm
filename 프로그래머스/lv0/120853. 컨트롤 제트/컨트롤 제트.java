import java.util.*;

class Solution {
    public int solution(String s) {
        // s = s.replaceAll(" ", ",");
        String [] test = s.split(" ");
        int answer = 0;
        for ( int i =0; i<test.length; i ++) {
            if (test[i].equals("Z")) {
                answer = answer - Integer.parseInt(test[i-1]);
            }else {
                answer += Integer.parseInt(test[i]);    
            }
            
        }
        return answer;
    }
}