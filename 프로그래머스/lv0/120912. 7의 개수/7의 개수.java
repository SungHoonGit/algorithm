class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++) {
            char[] test = Integer.toString(array[i]).toCharArray();
            for(int j=0; j<test.length; j++) {
                if ( test[j] == '7' ) {
                    answer ++;
                }
            } // for ennd
        } // for end
        return answer;
    }
}