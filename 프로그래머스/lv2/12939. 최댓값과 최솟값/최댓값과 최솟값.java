import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        List<Integer> numbers = new ArrayList<>();
        
        for (String numStr : str) {
            int num = Integer.parseInt(numStr);
            numbers.add(num);
        }
        
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        
        return min + " " + max;
    }
}
