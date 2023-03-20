class Solution {
    public int solution(int a, int b) {
        int answer = 2;

        
        for ( int i=2; i<=a; i++ ) {
            if (a%i==0 && b%i==0) {
                a=a/i;
                b=b/i;
            } // if end
        } // for end
        
        if(b==1) return answer=1; // 1/1일 경우.
        
        int count = 2;
        while (b>1) {
            if (b%count==0) {
               b = b/count;   
                if(count==2 || count==5) {
                    answer = 1;
                } else {
                    answer = 2; break;
                }
                continue;
            }// end  
            System.out.print(b);
            count++;
        }

        
        return answer;
    }
}