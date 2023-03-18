class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int [][] finder = new int[board.length][board[0].length];
        for(int i=0; i< board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if( board[i][j] == 1 ) {
                    if(i-1>=0 && j-1>=0)               finder[i-1][j-1] = 1;
                    if(i-1>=0 )                        finder[i-1][j] = 1;
                    if(i-1>=0 && j+1<board[0].length) finder[i-1][j+1] = 1;
                    if(j-1>=0)                         finder[i][j-1] = 1;
                                                        finder[i][j] = 1;
                    if(j+1<board[0].length)           finder[i][j+1] = 1;
                    if(i+1<board.length && j-1>=0)    finder[i+1][j-1] = 1;
                    if(i+1<board.length)                         finder[i+1][j] = 1;
                    if(i+1<board.length && j+1<board[0].length) finder[i+1][j+1] = 1;
                }
            }
        }//비안전지대 설정/
        
                for(int i=0; i< finder.length; i++) {
            for(int j=0; j<finder[0].length; j++) {
                if( finder[i][j] == 0 ) {
                    answer ++ ;
                }
            }
        }//안전지대 count/
        return answer;
    }
}