import java.util.Arrays;

class Solution {
    public int[] solution2(int[] arr, int[] query) {
        for(int i =0; i<query.length; i++) {
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
    
   public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }
        System.out.print(start + ", " +end);
        return Arrays.copyOfRange(arr, start, end + 2);
    }    
}