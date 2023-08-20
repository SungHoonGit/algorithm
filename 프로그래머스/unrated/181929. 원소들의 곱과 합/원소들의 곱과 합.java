class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int hap =0; int goop=1;
        for(int num : num_list) {
            hap +=num;
            goop *= num;
        }
        // System.out.println(hap + ", " + goop);
        // System.out.println(Math.pow(hap,2) + ", " + goop);
        if(Math.pow(hap,2) > goop ) answer =1;
        return answer;
    }
}