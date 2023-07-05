import java.util.Stack;
// LIFO 원리를 따르는 자료구조 Stack 이용

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()) {
            if( c == '(' ) {
                stack.push(c);
            } else if ( c == ')' ) {
                if(stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if( c == ')' && top != '(' ) {
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }
}