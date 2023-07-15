import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> dressroom = new HashMap<>();
        for(String[] str : clothes) {
            dressroom.put(str[1], dressroom.getOrDefault(str[1], 0) + 1);
        }
        // N(= 착용하는 경우의 수) + 1(=착용하지 않는 경우) * 옷 타입 개수 - 1(=모두 착용하지 않는 경우)
        // (x+a)(x+b)(x+c) = x3 + (a+b+c)x2 + (ab+bc+ca)x + (abc)

        for (String key : dressroom.keySet()) {
            answer *=(1+dressroom.get(key));
	    }
        return answer-1;
    }
}