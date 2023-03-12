import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        List<Integer> list =Arrays.stream(array).boxed().sorted().collect(Collectors.toList());
        
        for(int i=0; i<list.size(); i++) {
            if (list.get(i) > height) {
                answer ++;
            }
        }
        return answer;
    }
}