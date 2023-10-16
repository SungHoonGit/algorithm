import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> dice = new HashMap<Integer, Integer>();
        int result = 0;

        dice.put(a, dice.getOrDefault(a, 0) + 1);
        dice.put(b, dice.getOrDefault(b, 0) + 1);
        dice.put(c, dice.getOrDefault(c, 0) + 1);
        dice.put(d, dice.getOrDefault(d, 0) + 1);
        
        List<Integer> keys = new ArrayList<Integer>(dice.keySet());
        for(Integer v : keys) {
            System.out.print(dice.get(v) + " ");
        }

        switch(dice.size()) {
            case 1: 
                result = 1111 * a;
                break;
            case 2:
                if(dice.get(keys.get(0)) == 1 || dice.get(keys.get(1)) == 1) { // 1 : 3 주사위
                    int p = dice.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                    int q = dice.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);

                    result = (int)Math.pow((10 * p) + q, 2);
                } else { // 2 : 2 주사위
                    int p = keys.get(0);
                    int q = keys.get(1);
                    result = (p + q) * (Math.abs(p - q));
                }
                break;
            case 3:
                int temp = 0;
                for(Integer v : dice.keySet()) {
                    if(dice.get(v) != 2) {
                        if(temp == 0) {
                            temp = v;
                        } else {
                            temp *= v;
                        }
                    }
                }
                result = temp;
                break;
            case 4: 
                int temp2 = 7;
                for(Integer v : dice.keySet()) {
                    temp2 = temp2 > v ? v : temp2;
                }
                result = temp2;
                break;
        }

        return result;
    }
}