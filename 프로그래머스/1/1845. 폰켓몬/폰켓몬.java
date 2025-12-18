import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num); // 종류만 모음
        }

        int maxPick = nums.length / 2;

        return Math.min(set.size(), maxPick);
    }
}