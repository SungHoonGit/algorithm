import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        int test =my_str.length();
        
        
        for (int i=0; i<test; i+=n) {
            if( i+n <test) {
                list.add(my_str.substring(i, i+n));
                } else {
                list.add(my_str.substring(i, test));
            }
        } // list 생성 추가.
        
        String[] answer = new String[list.size()];
        for (int j = 0; j<list.size(); j++ ) {
            answer[j] = list.get(j);
        } // for end
        
        return answer;
    }
}