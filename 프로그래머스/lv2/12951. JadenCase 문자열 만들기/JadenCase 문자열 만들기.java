class Solution {
  public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");

        boolean flag = true;

        for(String ss : sp) {
            System.out.print(ss);
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        } // 그냥 통째로 다 소문자 만들고 앞에만 대문자.

        return answer;
  }
}