import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String[] solution(String[] todoList, boolean[] finished) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < todoList.length; i++) {
            if (!finished[i]) {
                result.add(todoList[i]);
            }
        }

        return result.toArray(new String[0]);
    }
}
