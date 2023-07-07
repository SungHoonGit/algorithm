class Solution {
    public int solution(int n) {
        int answer = 0;
        int count =1;
        
       /* while( count <= n ) {
            answer = fibo(count++);
           // System.out.println(answer);
        } */
        
        int[] D = new int[n + 1];
        D[0] = 0;
        D[1] = 1;
        for (int i = 2; i <= n; i++) {
            D[i] = (D[i - 1] + D[i - 2]) % 1234567;
        }
        
        return D[n];
    }
    
	public static int fibo(int n) {
		if (n <= 1) {
        	return n;    
        } else {
            return fibo(n-2) + fibo(n-1);            
        }
    }
}