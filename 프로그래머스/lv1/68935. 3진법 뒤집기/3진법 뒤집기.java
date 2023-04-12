import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        answer =three(n);
        return answer;
    }
    
    public int three( int n ) {
        int third = 0;

        List<Integer> temp = new ArrayList<>();
        // 3진법으로 변환하여 list에 담기
        while (n > 0) {
            temp.add(n % 3);
            n /= 3;
        }
 
        for (int i = 0; i < temp.size(); i++) {
            third += (Math.pow(3, temp.size()-i-1)*temp.get(i));
        }
        return third;
    }
    
}