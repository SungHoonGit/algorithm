class Solution {
    public String solution(String s) {
        String answer = "";
        s += "1";
        String[] test2 = s.split(" ");
        
        for(int j=0; j<test2.length; j++ ) {
            String[] test = test2[j].split("");

            for(int i=0; i<test.length; i++) {
                if(i%2==0) {
                    answer += test[i].toUpperCase();
                } 
                if(i%2!=0) {
                    answer += test[i].toLowerCase();
                } // if 2 end                
            }
            if ( j != test2.length-1) {
                answer += " ";
            } 
        }
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}