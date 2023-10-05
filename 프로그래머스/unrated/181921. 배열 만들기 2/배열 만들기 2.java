import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (containsOnly05(i)) {
                resultList.add(i);
            }
        }
        
        if (resultList.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] resultArray = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                resultArray[i] = resultList.get(i);
            }
            return resultArray;
        }
    }

    private static boolean containsOnly05(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}