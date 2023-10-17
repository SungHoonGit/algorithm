import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> resultList = new ArrayList<>();
        
        for (String str : intStrs) {
            if (str.length() < s + l) {
                continue; 
            }

            String subStr = str.substring(s, s + l);
            int num = Integer.parseInt(subStr);
            
            if (num > k) {
                resultList.add(num);
            }
        }
        
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        
        return resultArray;
    }
}