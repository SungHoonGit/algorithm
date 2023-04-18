class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int count = 0;
        int zero  = 0;
        for(int i : lottos ){
            for(int j: win_nums) {
                if(i == j) {
                    count++;
                }
            }
            if(i==0) zero ++;
        }// for end
        System.out.println(count  + " " + (zero+count));
        int[] answer = {level(zero+count), level(count)};
        return answer;
    }
    
    public int level(int n) {
        int ansewr = 0;
        if (n == 0) { ansewr = 6; }
        if (n == 1) { ansewr = 6; }
        if (n == 2) { ansewr = 5; }
        if (n == 3) { ansewr = 4; }
        if (n == 4) { ansewr = 3; }
        if (n == 5) { ansewr = 2; }
        if (n == 6) { ansewr = 1; }
        
        return ansewr;
        
    }
}