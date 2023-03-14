class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 아스키 코드 A-65  Z-90  a-97  z-122 
        for (int i=0; i<my_string.length(); i++ ){
            char test = my_string.charAt(i);
            if (test>=65 && test <=90) {
                answer += (char) (test + 32 );    
            } else {
                answer += (char) (test - 32 );    
            }
            
        }
        return answer;
    }
}