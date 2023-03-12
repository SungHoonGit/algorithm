class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int size = numbers.length;
        String chcek ="";
        if (direction.equals("right")) {
            answer[0] = numbers[size-1];
        for(int i=1; i<size; i++) {
              answer[i] = numbers[i-1];
            } // for end
        } else {
            answer[size-1] = numbers[0];
        for(int i=0; i<size-1; i++){
            answer[i] = numbers[i+1];
            }
        }
        return answer;
    }
}