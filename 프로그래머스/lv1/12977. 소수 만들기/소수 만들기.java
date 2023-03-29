class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int t =j+1; t<nums.length; t++ ) {
                    int test = nums[i]+nums[j]+nums[t];
                    if ( sosu(test) == 2) {
                        answer++;
                    } // if end
                } // for 1 end
            } // for 2 end
        } // for 3 end

        return answer;
    } // solution
    
    public int sosu(int n) {
        int count = 0;
       for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                count += 1;
            if(count >= 3)
                return count;
        }        
        return count;
    } // sosu end
}