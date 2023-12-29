import java.util.regex.*;

class Solution {
    public String solution(String s) {
        
        String answer = "";
        String[] arr = s.toLowerCase().split("");
        boolean isTrue = true;
        
        for(String i : arr){
            answer += isTrue ? i.toUpperCase() : i;
            isTrue = i.equals(" ") ? true : false;
        }
        return answer;
    }
}


class Solution2 {
    public String solution(String s) {
        Matcher m = Pattern.compile("\\b([\\w])([\\w]*)").matcher(s);
        while (m.find()) {
            s = s.replaceAll("\\b" + m.group(), m.group(1).toUpperCase() + m.group(2).toLowerCase());
        }
        return s;
    }
}