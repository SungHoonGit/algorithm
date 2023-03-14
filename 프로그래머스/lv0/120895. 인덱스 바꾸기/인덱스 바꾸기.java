class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        String[] test = my_string.split("");
        String answer = test[num1];
        test[num1] = test[num2];
        test[num2] = answer;
        answer = "";
        for (int i=0; i<test.length; i++) {
            answer += test[i];
        }
        
        return answer;
    }
}