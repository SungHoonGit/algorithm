class Solution {
    public String solution(String phone_number) {
        String answer ="";
        int count =0;
        for ( String str : phone_number.split("")) {
            if(count>phone_number.length()-5) {
                answer += str;
            } else {
                answer += "*";
            }
            count++;
        }
        return answer;
    }
}