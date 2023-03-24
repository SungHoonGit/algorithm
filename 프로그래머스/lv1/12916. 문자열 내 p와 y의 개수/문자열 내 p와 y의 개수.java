class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s=s.toLowerCase(); // 소문자로 변경.
        int p = 0;
        int y = 0;
        String[] sS = s.split(""); // 배열 설정.
        for(int i = 0; i < sS.length; i++ ){
            if( sS[i].equals("p")) { p++;}
            if( sS[i].equals("y")) { y++;}
        } // 숫자 counting
        
        if (p!=y) {
            answer = false;
        }// if end

        return answer;
    }
}