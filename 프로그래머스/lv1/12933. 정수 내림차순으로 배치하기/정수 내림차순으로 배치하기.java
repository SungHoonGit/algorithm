import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String test = String.valueOf(n); // String to Long ==> Long.toString() 
        String[] test2 = test.split("");
        String test3 = "";
        Arrays.sort(test2);
        for(int i=test2.length-1; i>=0; i--) {
            test3 += test2[i];
        } // reverse end
        System.out.print(test3);
        answer = Long.parseLong(test3); // Long to String
        return answer;
    }
}