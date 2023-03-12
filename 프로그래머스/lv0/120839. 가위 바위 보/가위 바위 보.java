class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] result = rsp.split("");
        for(int i =0; i <result.length; i ++) {
            
             switch (result[i]) {
            case "2":  answer += "0";
                     break;
            case "0":  answer += "5";
                     break;
            case "5":  answer += "2";
                     break;
          }
        }
              return answer;
    }
}