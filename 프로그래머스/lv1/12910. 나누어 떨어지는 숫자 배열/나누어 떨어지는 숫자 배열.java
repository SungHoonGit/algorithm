import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if (i%divisor==0) {
                list.add(i);
            }
        } // for end

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i]= list.get(i);
        } // for end
        int[] answers = {-1};
        
        if(list.size()==0) {
            return answers;
        } else {
            return answer;
        } // if endanswer; 
    }
}