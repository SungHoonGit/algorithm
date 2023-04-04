
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int count = 0;
        int size = board[0].length;
        int[] box = new int[1000];        
        
        for(int i : moves) {
            for( int j=0; j<size; j++) {

                int test = board[j][i-1];
                board[j][i-1] = 0;
                if(test != 0) {
                    if( count>0 && box[count-1]==test ) {
                        box[count-1] = 0;
                        answer= answer+2;
                        count--;
                        break;
                    } else {
                        box[count] = test;
                        count++;
                        break;                        
                    }
                }
      
            }

        }

        return answer;
    }
}