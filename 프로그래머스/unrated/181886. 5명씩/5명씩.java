import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] names) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < names.length) {
            result.add(names[index]);
            index += 5;
        }

        return result.toArray(new String[0]);
    }
}