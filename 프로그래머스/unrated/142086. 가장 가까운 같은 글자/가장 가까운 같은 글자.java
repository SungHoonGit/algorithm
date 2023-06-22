class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int count = 0;
        for(int i = 0; i < s.length(); i++ ) {
                count = -1;
            for(int j = i-1; j >= 0; j-- ) {
                // System.out.println("i = " + s.charAt(i) +", j = " + s.charAt(j) );
                if(s.charAt(i) == s.charAt(j)) {
                    count= i-j; 
                    break;
                }
            }
            answer[i]=count;
        }
        return answer;
    }
}