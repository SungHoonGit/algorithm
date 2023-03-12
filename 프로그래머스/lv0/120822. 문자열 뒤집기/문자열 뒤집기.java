class Solution {
    public String solution(String my_string) {
        String answer = "";
        int size = my_string.length();
        for(int i=0; i<size; i++) {
            answer = answer + my_string.charAt(size-1-i);
        }
        return answer;
    }
}