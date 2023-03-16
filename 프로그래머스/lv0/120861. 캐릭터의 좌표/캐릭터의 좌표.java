class Solution {
    public int[] solution(String[] keyinput, int[] board) {
            int[] answer = {0,0};
            int x = board[0]/2;
            int y = board[1]/2;
            for(String i : keyinput ) {
            if ( i.equals( "left" ) && answer[0] > -x ) answer[0] --;
            if ( i.equals("right") && answer[0] < x ) answer[0] ++; 
            if ( i.equals("up") && answer [1] < y ) answer [1] ++;
            if ( i.equals("down" ) && answer [1] > -y ) answer [1]--; // for end
            }
        return answer;
    }
}