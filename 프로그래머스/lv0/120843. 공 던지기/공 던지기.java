class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count =0;
        for(int i=1; i<k; i++) {
            count += 2;
            if(count>numbers.length) {
                count-= numbers.length;
            }
        } // for end         
        return answer=numbers[count];
    }
}