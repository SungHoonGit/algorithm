import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int strLen = s.length();

        for(int i = 0; i < strLen; i++)
            answer += cal(s, i, strLen);

        return answer;
    }

    public int cal(String s, int strtIdx, int strLen){
        int ret = 0;
        Stack<Character> st = new Stack<>();

        for(int i = strtIdx; i < strtIdx + strLen; i++){
            int idx = i % strLen;
            char c = s.charAt(idx);

            if(c == '(' || c == '{' || c == '[')
                st.push(c);
            else if(c == ')' || c == '}' || c == ']'){
                if(st.empty())
                    return 0;
                else if((st.peek() != '(' && c == ')') || (st.peek() != '{' && c == '}') || (st.peek() != '[' && c == ']'))
                    return 0;
                else
                    st.pop();
            }
        }

        if(!st.empty())
            return 0;

        return 1;
    }
}