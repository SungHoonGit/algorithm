import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int count = 0;
        char[] charst = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        int[] charsize = new int[charst.length];
        // System.out.println(Arrays.toString(charsize));
        // 4 점 기준으로 앞 뒤 선택하기. 
        // map 에 저장하기.
        // map 정렬하여 출력하기.
        
        for(int i : choices) {
            char front = survey[count].charAt(0);
            char last = survey[count].charAt(1);
            int f=0,l =0; 
            for( int a = 0; a<charst.length; a++) {
                if(front==(charst[a])) { f = a ; }
                if(last==(charst[a])) { l = a ; }
            }
            switch ( i ) {
                case 1 : charsize[f]+=3; break;  
                case 2 : charsize[f]+=2; break;  
                case 3 : charsize[f]+=1; break;
                case 4 : break; 
                case 5 : charsize[l]+=1; break;
                case 6 : charsize[l]+=2; break;
                case 7 : charsize[l]+=3; break;      
            }
            count++;
        }
         System.out.println(Arrays.toString(charsize));
        for(int i=0; i<charst.length; i+=2) {
            if(charsize[i]>=charsize[i+1]) {
                answer+=charst[i];
            } else {
                answer+=charst[i+1];
            }
        }
        return answer;
    }
}