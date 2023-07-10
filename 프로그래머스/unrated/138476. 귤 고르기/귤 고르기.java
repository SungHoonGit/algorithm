import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // 귤의 크기별로 등장 횟수를 카운트
        for (int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }
        
        // 등장 횟수를 기준으로 오름차순으로 정렬 
     
        List<Integer> list = new ArrayList<>();
        for (Integer x : countMap.keySet()) {
            list.add(countMap.get(x));
        }
        list.sort(Collections.reverseOrder());
       
        // System.out.println(list);
        
        int sum = 0;
        int ans = 0;

        for (Integer x : list) {
            ans++;
            sum += x;
            if (sum >= k) {
                break;
            }
        }

        return ans;
    }
}
