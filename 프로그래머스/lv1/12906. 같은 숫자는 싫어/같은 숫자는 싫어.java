import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1]!=arr[i]) {
                list.add(arr[i-1]);    
            }
            if(i==arr.length-1) {
                list.add(arr[arr.length-1]);
            }
        }// set 에다 저장.
        int[] answer = new int [list.size()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}