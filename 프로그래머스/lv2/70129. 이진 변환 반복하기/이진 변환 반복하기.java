import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int count = 0; // 이진 변환 횟수
        int removedZeros = 0; // 제거된 0의 개수
        
        while (!s.equals("1")) {
            // 1. 0 제거
            int length = s.length();
            s = s.replaceAll("0", "");
            removedZeros += length - s.length();
            
            // 2. 이진 변환
            s = Integer.toBinaryString(s.length());
            
            count++;
        }
        
        answer[0] = count;
        answer[1] = removedZeros;
        
        return answer;
    }
}