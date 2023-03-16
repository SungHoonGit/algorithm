import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for( int check : numlist ) {
            if ( check%n == 0 ) {
                list.add(check);
            }
        } // list 테이터값 넣기.
        
        int[] answer = new int[list.size()];
        
        for (int i=0; i < answer.length; i++ ) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}