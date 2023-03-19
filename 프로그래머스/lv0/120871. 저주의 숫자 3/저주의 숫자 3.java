
class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt=1;
        boolean check=false;
        String numstr ="";
        
        while(true){    // 반복 
            check=false;

            if(answer%3==0){
                answer++;
                continue;
            }    // 3의 배수일 경우

            numstr=String.valueOf(answer); // 문자열로 변환.
            
            if(numstr.contains("3")){
                answer++;
                check=true;
                //break;
            } // 3 있는지 확인. 2가지 결과를 위한 boolean
            if(check) continue;
                // check true 일경우.
                if(cnt==n)break;
                    // 최종으로 while 나가기.
            answer++;
            cnt++;
                // 아닌경우
        }
        return answer;
    }
}
