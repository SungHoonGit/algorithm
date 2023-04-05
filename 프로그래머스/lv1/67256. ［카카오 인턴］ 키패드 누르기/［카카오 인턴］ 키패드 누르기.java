import java.util.Arrays;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int left=10;
        int rigth=12;

        for( int i : numbers) {
            
            if(i == 0) i=11;
            if ( i == 1 || i == 4 || i == 7 ){ answer +="L"; left = i ;}
            else if ( i == 3 || i == 6 || i == 9 ){ answer +="R"; rigth = i ;}
            else {
                // x 축과 y 축 비교.
                if ( test(i, left, rigth, hand).equals("left") ) { answer +="L"; left = i; }
                else if (test(i, left, rigth, hand).equals("right") ) { answer +="R"; rigth = i; }

            }
        }
        
        return answer;
    }
    
    
    public String test(int i, int left, int right, String hand) {
        if (i == left) return "left";
        if (i == right) return "right";
        System.out.println("i :" +i +"  left : "+left +" right : "+right);        
        String test = "";
        //x 축
        int ix = i%3;
            if(ix==0)  ix=3;
        int leftx = left%3;
            if(leftx==0) leftx=3;
        int rightx = right%3;  
            if(rightx==0) rightx=3;
        System.out.println("ix :" +ix +"  leftx : "+leftx +" rightx : "+rightx);
        //y 축
        int iy = i/3;
        int lefty = left/3;
        int righty = right/3;  
            if(right%3==0) righty --;    
        
        System.out.println("iy :" +iy +"  lefty : "+lefty +" righty : "+righty );            

        int leftdistance = Math.abs(ix-leftx)+ Math.abs(iy-lefty);
        int rightdistance = Math.abs(ix-rightx)+ Math.abs(iy-righty);   
        if (leftdistance>rightdistance) {
            test = "right";
        } else if (leftdistance<rightdistance){
            test = "left";
        } else {
            test = hand;
        }
        
        
        
        System.out.println(leftdistance+ "  "+rightdistance + " " + test);
        
        return test;
    }
    
}