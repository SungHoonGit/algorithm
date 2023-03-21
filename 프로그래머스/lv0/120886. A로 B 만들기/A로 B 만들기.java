import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] before2 = before.toCharArray();
        char[] after2 = after.toCharArray();
        Arrays.sort(before2);
        Arrays.sort(after2); // 정렬.

        if((Arrays.toString(before2)).equals(Arrays.toString(after2))) { // string 으로 비교.
            System.out.println("why?");
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}