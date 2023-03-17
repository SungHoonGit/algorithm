class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        if (numbers.length>2) {
            for(int i=0; i<numbers.length; i++) {
                for (int j=0; j<numbers.length; j++) {
                    if(numbers[i]*numbers[j]>answer && i != j) answer=numbers[i]*numbers[j];
                }
            }// for end
        } else {
            answer = numbers[0]*numbers[1];
        }// if end
        return answer;
    }
}