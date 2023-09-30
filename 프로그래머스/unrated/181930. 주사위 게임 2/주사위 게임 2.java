class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        switch(checkcase(a,b,c)) {
            case 0 : answer = a + b + c; break;
            case 1 : answer = (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)); break;
            case 2 : answer = (a+b+c) * (int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))
                                      * (int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)); break;                   
        }
        
        return answer;
    }
    
    public int checkcase(int a, int b, int c) {
        int answer = 0;
        if(a==b && b==c) answer =2;
        else if (a!=b && b!=c && c!=a) answer=0;
        else answer=1;
        return answer;
    }
}