import java.util.*;

class Solution {
    public int[] solution(int n) {
        
   List<Integer> factors = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            factors.add(i);
        }
    } // 약수 구하고, List 에 담기.
        
    int[] answer = new int[factors.size()];
    // List 크기의 int[] 배열 생성
    for(int j=0; j<factors.size(); j++ ){
        answer[j] = factors.get(j);
    }
        return answer;
    }
}