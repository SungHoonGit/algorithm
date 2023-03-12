class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int count = 0;
        for(int i=0; i<emergency.length; i++) {
             for(int j=0; j<emergency.length; j++) {
                if (emergency[i]<emergency[j]) {
                    answer[j] = answer[j]-1;
                }
            }   
           answer[i] = answer[i] + emergency.length;
        }
        
        return answer;
    }
}