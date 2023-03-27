class Solution {
    public int[] solution(long n) {
        String test = Long.toString(n);
        int[] answer = new int[test.length()];
        for (int i =0; i<test.length(); i++) {
            answer[test.length()-1-i]=(test.charAt(i)-48);
        }
        return answer;
    }
}