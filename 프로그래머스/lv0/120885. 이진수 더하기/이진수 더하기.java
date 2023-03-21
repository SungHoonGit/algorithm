import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
    
        int ban1 = Integer.parseInt(bin1, 2);
        int ban2 = Integer.parseInt(bin2, 2); // 2 진수 -> 10 진수 
        int test = ban1 + ban2;
        String answer = Integer.toBinaryString(test); // 10진수 -> 2진수
        return answer;
    }
}