class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] test = Integer.toString(num).split("");
        for(int i=0; i<test.length; i ++) {
            if (test[i].equals(Integer.toString(k))) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}