class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int test1 = common[1]-common[0];
        int test2 = common[2]-common[1];
        if (test1 == test2 ) {
            answer = common[common.length-1] +test1;
        } else {
            answer = common[common.length-1] * test2/test1;
        }
        return answer;
    }
}