import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(String str : strArr) {
            map.put(str.length(),  map.getOrDefault(str.length(), 0) + 1);
            if(map.get(str.length())>answer) answer = map.get(str.length());
        }
        
       // System.out.print(map);
        return answer;
    }
}