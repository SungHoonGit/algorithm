class Solution {
    public String solution(String myString, String pat) {
        // String 위치 찾기 indexOf() 뒤에서 부터 찾기 lastIndexOf()
        String answer = myString.substring(0,myString.lastIndexOf(pat)+pat.length());
        return answer;
    }
}