import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0 ;
        int y = 0 ;
        String[] test = polynomial.split(" \\+ ");
        for (String a : test) {
            if( a.contains("x")) {
                if (a.equals("x")) {
                    x+=1;
                } else {
                    x += Integer.parseInt(a.replace("x",""));
                }
            } else if (a.contains(" ")){
                return answer = "0";
            } else {
                y += Integer.parseInt(a);
            }
        } // x 와 기본 합 
        if (x==0) {
            answer = y +"";
        } else {
            if ( y != 0) {
                if (x!=1) {
                answer = x + "x + " + y;        
                } else {
                    answer = "x + " +y;
                }
            } else {
                if (x!=1) {
                answer = x + "x";    
                } else {
                    answer = "x";
                }
            }
        }
        return answer;
    }
}