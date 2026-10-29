import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        // 4개 다 같은 경우
        if (map.size() == 1) {
            return 1111 * a;
        }

        // 두 종류 숫자
        if (map.size() == 2) {
            int p = 0, q = 0;

            for (int num : map.keySet()) {
                if (map.get(num) == 3) p = num;
                else if (map.get(num) == 1) q = num;
            }

            // 3:1 패턴
            if (p != 0) {
                return (int)Math.pow(10 * p + q, 2);
            }

            // 2:2 패턴
            Integer[] nums = map.keySet().toArray(new Integer[0]);
            return (nums[0] + nums[1]) * Math.abs(nums[0] - nums[1]);
        }

        // 2:1:1 패턴
        if (map.size() == 3) {
            int result = 1;

            for (int num : map.keySet()) {
                if (map.get(num) == 1) {
                    result *= num;
                }
            }

            return result;
        }

        // 전부 다른 경우
        return Math.min(Math.min(a, b), Math.min(c, d));
    }}