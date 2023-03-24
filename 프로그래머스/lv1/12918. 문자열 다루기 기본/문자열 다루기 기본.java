class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length()==4 || s.length()==6) {
            s = s.replaceAll("[0-9]",""); // 정규식 이용 replaceAll 
            if(s.equals("")) {
                answer = true;
            } else {
                answer = false;
            }
        } // 문자열 길이 확인.
        // boolean answer = s.matches("[0-9]+"); // 정규식 + 이것만 있는지


        System.out.print(s);
        return answer;
    }
}