class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] count = new int[200]; // 배열 생성후
        
        // 배열판에 공간만큼 찾아주기
        for(int i = 0; i<3; i++) {
            System.out.print(lines[i][0]);
            System.out.println(lines[i][1]);
            for (int check = 100 + lines[i][0]; check<100+lines[i][1]; check ++) {
                count[check]++;
                System.out.println(count[check]);
            } // for end
            
        } // for end
        
        for ( int j = 0 ; j<count.length; j++) {
            if( count[j] >1) {
                answer ++;
            }
        } //for end 2이상 값 찾기.
        
        return answer;
    }
}