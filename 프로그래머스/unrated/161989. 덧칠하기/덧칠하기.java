class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] ntotal = new int[n];
        
        for(int i : section) {
            ntotal[i-1] =1;
        }
   
        for(int i=0; i<ntotal.length; i++) {
            if(ntotal[i] == 1) {
                for(int j=0; j<m; j++) {
                    ntotal[i+j] = 0;
                    if(i+j+1==n) break;
                }
                answer++;
            }         
        }


        return answer;
    }
}