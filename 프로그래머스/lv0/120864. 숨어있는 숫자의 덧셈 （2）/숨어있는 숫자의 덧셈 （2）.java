import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string += "-"; // 주먹구구식  1개이거나 마지막 숫자가 안됨.
        String add = "";
        char[] test = my_string.toCharArray();
            
        for (int i=0; i<test.length; i++ ) {
            if ( 48<=test[i] && test[i]<=57 ) {
                int j = i; // i 번째부터 실행
                while ( 48<=test[j] && test[j]<=57 ) {
                    add += test[j];    
                        j++;
                } // 문자열로 숫자 크기 계속 더해주기
                answer += Integer.parseInt(add);
                add = ""; // 문자열 비워주기
                i = j-1; // j 증가만큼 i 넘기기.    
            } // if end
        }// for end
        return answer;
        
    }
}