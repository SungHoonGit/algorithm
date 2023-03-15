class Solution {
    public int solution(String my_string) {
        String[] test = my_string.split(" ");
        int answer = Integer.parseInt(test[0]);
        
        for (int i=1; i<test.length; i=i+2) {
            if(test[i].equals("+") )  {
                answer = answer + Integer.parseInt(test[i+1]);
            } else {
                answer = answer - Integer.parseInt(test[i+1]);
            } // if end
        } // for end

        return answer;
    }
}