class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] str1Array = str1.split("");
        String[] str2Array = str2.split("");
        for(int i=0; i<str1Array.length; i++) {
            answer += str1Array[i] + str2Array[i];
        }
        return answer;
    }
}