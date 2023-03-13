class Solution {
    public int solution(int order) {
        int answer = 0;
        String to  = Integer.toString(order); // String 으로 변경후
        String[] test = to.split("");   // 배열 생성
        for ( String n : test ) {
            if ( Integer.parseInt(n)%3==0 &&  Integer.parseInt(n) !=0) {
                answer ++;
            } // if end
        } // for end
        return answer;
    }
}