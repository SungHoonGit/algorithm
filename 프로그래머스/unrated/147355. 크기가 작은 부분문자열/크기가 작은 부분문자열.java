
class Solution {
     public int solution(String t, String p) {
        int answer = 0;
        try {
            for (int i = 0; i < t.length(); i++) {
                String num = t.substring(i, i + p.length());
                if (num.compareTo(p) < 1) {
                    answer++;
                }
            }
        } catch (Exception e) {
            System.out.println("end");
        }
        return answer;
    }
}
