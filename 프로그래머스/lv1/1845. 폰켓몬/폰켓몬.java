import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        int check = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        } // hashMap setting

      if (max < set.size()){
        answer = max ;
      } else {
          answer = set.size();
      } // if end

        return answer;
    }
}