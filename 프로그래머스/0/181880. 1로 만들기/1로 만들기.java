class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int num : num_list) {
            while(num!=1) {
                if(evenodd(num)) {
                    num=num/2;
                }else {
                    num=(num-1)/2;
                }
                answer++;
            }
        }
        return answer;
    }
    
    public boolean evenodd(int num) {        
        return ((num%2==0)? true : false);
    }
}