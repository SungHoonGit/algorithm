class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int test =0;
        for(int i=0; i<number.length; i++) {
            for(int j = i+1; j<number.length; j++) {
                for(int l = j+1; l<number.length; l++) {
                    test = 0;
                    test = number[i] + number[j] + number[l];
                    if(test == 0) {
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }
}