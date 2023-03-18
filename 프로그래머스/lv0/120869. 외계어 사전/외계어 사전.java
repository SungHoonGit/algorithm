class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int test = 0;
        for ( int i = 0; i<dic.length; i++ ) {
            for ( int j =0; j<spell.length; j++) {
                if( dic[i].contains(spell[j]) ) {
                    test ++;
                }
            } // spell 겹치는 글자수 카운팅.
            if (test==spell.length) {
                answer =1;
                return answer;
            } else {
                answer =2;
            } // spell 수와 같다면 진행 아닐시, 계속 돌기.
            test =0; // 0으로 돌리기~
        }
        
        return answer;
    }
}