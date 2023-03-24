class Solution {
    boolean isPrimeNumber(int x){
        int end = (int) Math.sqrt(x);
        for(int i=2;i<=end;i++){
            if(x%i ==0) return false;
        }
        return true;
    }

    public int solution(int n) {
        int answer = 0;

        for(int cnt =2 ;cnt <=n;cnt++){
            if(isPrimeNumber(cnt)){answer++;}
        }

        return answer;
    }
}
        /*에라토스테네스의 체 
        ex) n =10
        i =2 
        j =2
        cnt =0

        j<=4
        2%2

        */