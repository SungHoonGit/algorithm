class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int X = x;
        int test=0;
        while(x!=0) {
            test +=x%10;
            x= x/10;
        }
        System.out.print("x :" + x + " test : "+ test);
        if(X%test!=0) {
            answer = false;
        }
        return answer;
    }
}