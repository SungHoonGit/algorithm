

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<array.length; i++) {
            if(array[i]>max) {
              min = i;
              max = array[i];  
            } 
        }
        answer[0] = max;
        answer[1] = min;
        return answer;
    }
}