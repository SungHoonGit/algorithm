class Solution {
    public int[] solution(int[] arr) {

        int min=-1; int max=-1;
        for(int i=0; i<arr.length; i++) {
            if (arr[i]==2) {
                if (min == -1 || i < min) {
                    min = i;
                }
                if (max == -1 || i > max) {
                    max = i;
                }        
            }
        } // for end
        // System.out.print("min" + min + "max" + max);
        int[] answer = new int[max-min+1];
        int j=0;
        if(min==-1) {
            answer[0]=-1; 
        } else {
            for(; min<=max; min++) {
                answer[j++]=arr[min];
            }            
        }
        return answer; 
    }
}