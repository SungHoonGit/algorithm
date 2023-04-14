class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;
        while(left<=right) {
            for(int i = 1; i <= left; i++){
                if(left % i == 0){
                    cnt ++;
                }
            } // 약수의 갯수 찾기.
            if(cnt%2==1) {answer -= left; } else { answer += left;}

            left++;
            cnt=0; // 초기화
        }
        return answer;
    }

}