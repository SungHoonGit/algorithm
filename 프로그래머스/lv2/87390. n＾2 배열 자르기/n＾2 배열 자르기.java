import java.util.*;

class Solution {
    
    public static int[] solution(int n, long left, long right) {

        int[] answer = new int[(int)(right - left) + 1];
        for (int i = 0; i < answer.length; i++) {
            int y = (int)(left / n + 1);
            int x = (int)(left % n + 1);
            left++;
            answer[i] = Math.max(y, x);
        }

        return answer;
    }
    
    public int[] solution2(int n, long left, long right) {

        int a = Long.valueOf(left).intValue();
        int b = Long.valueOf(right).intValue()+1;
        int arr[] = new int[b-a];
        int size = 0;
        for(int i=0; i<n; i++ ) {
            for(int j=0; j<n; j++) {
                // System.out.println("i = "+i + ", j = " + j);
                if( (n * i + j) >=a && (n * i + j)<b ) {
                    if(i==0) {
                        arr[size]=j+1;
                    } else if (i>j) {
                        arr[size]=i+1;
                    } else {
                        arr[size]=j+1;
                    }// if end
                    size++;
                }// if end
            }// for end
        } // 이중배열 만들기.

        return arr;
    }
    
}