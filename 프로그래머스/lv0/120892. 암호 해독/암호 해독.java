class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] test = cipher.split("");
        
        for(int i=code-1; i< test.length; i=i+code) {
            answer += test[i];
        }
        return answer;
    }
}