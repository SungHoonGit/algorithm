import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = 1;

        if(n == 1) {
            a = 0;
        } else if(n == 2) {
            b = num_list.length - 1;
        } else if(n == 4) {
            c = slicer[2];
        } 

        int size = (b - a) / c;
        int[] answer = new int[size+1];

        int index = 0;
        for(int i = a; i < b + 1; i+=c) {
            answer[index++] = num_list[i];
        }

        return answer;
    }
}

class Solution2 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a=0;
        int b=num_list.length;
        int c = 1; 
        int size =0;
        
        switch (n) {
            case 1 : b=slicer[1]; 
                    break;
            case 2 : a= slicer[0];
                    break;
            case 3 : a= slicer[0]; b= slicer[1];
                    break;
            case 4 :  a= slicer[0]; b= slicer[1]; c = slicer[2];
                    break;
        }
        //System.out.printf("a::%d b::%d c::%d", a,b,c );

        int[] answer = new int[(b-a)/c+1];
        
        for(int i = a; i<=b; i=i+c){
            answer[size++] = num_list[i];
        }
        
        return answer;
    }
}
