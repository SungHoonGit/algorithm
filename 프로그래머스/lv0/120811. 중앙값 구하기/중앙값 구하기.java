import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
       List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int[] answers = list.stream().mapToInt(Integer::intValue).toArray();
        return answers[array.length/2] ;
    }
}