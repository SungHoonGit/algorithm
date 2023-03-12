

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int[] test = {1,2,3,4,5,6,7,8,9,0};
        for(int i =0; i< my_string.length(); i++) {
            for(int j=0; j<test.length; j++) {
                if ( Integer.parseInt(my_string.substring(i,i+1))==test[j]) {
                    answer = Integer.parseInt(my_string.substring(i,i+1) );
                }
            }
        }
        return answer;
    }
}