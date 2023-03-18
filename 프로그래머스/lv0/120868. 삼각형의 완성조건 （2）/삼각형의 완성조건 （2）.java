import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        int test = sides[0] + sides[1] ;
        int test2 = 0;
        int test3 = sides[1] - sides[0] ;
        for (int i = test3; i<sides[1]; i++) {
            answer ++;
        } // for end
        for ( int j = sides[1]+1; j<test; j++ ) {
            answer++;
        } // for end
        return answer;
    }
}