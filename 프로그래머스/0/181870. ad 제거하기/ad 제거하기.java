import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        ArrayList<String> StringArray = new ArrayList<String>(); // 타입 지정
        int count = 0;
        for(String str : strArr) {
            if(!str.contains("ad")) {
                StringArray.add(str);
            }
            count++;
        }
        System.out.print(StringArray);
        // String[] answer = StringArray.toArray(new String[StringArray.size()]);
        String[] answer = StringArray.toArray(new String[0]);
        
        return answer;
    }
}