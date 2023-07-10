import java.util.Stack;
// LIFO 원리를 따르는 자료구조 Stack 이용

class Solution {
    
    public int solution(String s) {
        int answer = 0;
        
        String rotatedString = s; // 초기 문자열 저장

        for (int i = 0; i < s.length(); i++) {
            char firstChar = rotatedString.charAt(0); // 앞글자 저장
            rotatedString = rotatedString.substring(1) + firstChar; // 앞글자를 제외한 나머지 문자열에 앞글자를 뒤로 붙임
            // System.out.println(rotatedString);
             if(check(rotatedString)) answer++;               
        } // for end  

        return answer;
    } // solution end
    
    public boolean check(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }// for end
        
        return stack.isEmpty();
    } // check end
    
}