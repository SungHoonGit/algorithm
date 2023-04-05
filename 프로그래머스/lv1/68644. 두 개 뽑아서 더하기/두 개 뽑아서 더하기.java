import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        System.out.print(set);
        int[] answer = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        int cnt = 0;
        while(iterator.hasNext()) {
            answer[cnt] = iterator.next();
            cnt++;
        }
        Arrays.sort(answer);
        return answer;
    }
}