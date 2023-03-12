class Solution {
    public String solution(int age) {
        String answer = "";
        String[] check = {"a","b","c","d","e","f","g","h","i","j"};
        String temp = Integer.toString(age);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            digits[i] = temp.charAt(i) - '0';
            answer += check[digits[i]];
       }
        return answer;
    }
}