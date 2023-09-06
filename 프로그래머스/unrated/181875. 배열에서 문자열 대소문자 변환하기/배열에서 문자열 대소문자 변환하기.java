class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int count = 0;
        for(String str : strArr) {
            answer[count++] =  count%2!=0 ?  str.toLowerCase() : str.toUpperCase();
        }
        return answer;
    }
}