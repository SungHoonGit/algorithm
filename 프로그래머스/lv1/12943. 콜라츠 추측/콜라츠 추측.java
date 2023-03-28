class Solution {
    public int solution(int nums) {
        int answer = 0;
        Long num=Long.valueOf(nums); // int to long
        while(num!=1) {
            System.out.println(num +"and"+ answer);
            if(num%2==0) num=num/2;
            else num=num*3+1;
            answer ++;
            if(answer==500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}