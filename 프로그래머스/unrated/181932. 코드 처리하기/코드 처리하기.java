class Solution {
    public String solution(String code) {
        String answer = "";
        int count = 0;
        boolean mode = true;
        for(char chr : code.toCharArray()) {
            
            if(mode) {
                if(chr=='1') {
                    mode=false;
                } else {
                    if(count%2==0){
                    answer+=chr; 
                  }
                }
            } else {
              if(chr=='1') {
                    mode=true;
                } else {
                    if(count%2!=0){
                    answer+=chr; 
                  }
                }
            }
            count++;
        }
        
        if(answer.length()==0) answer = "EMPTY";
        return answer;
    }
}