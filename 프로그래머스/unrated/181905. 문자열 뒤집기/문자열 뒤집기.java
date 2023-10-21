class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String head = my_string.substring(0,s);
        String body = reverse(my_string.substring(s,e+1));
        String footer = my_string.substring(e+1);
        
        answer = head + body + footer ;
        return answer;
    }
    
    public String reverse(String body) {
        String rbody = "";

        if(body.length()>0) {
            for(int i=body.length()-1; i>=0; i--) {
                rbody += body.charAt(i);
            }
            return rbody;
        }
        
        return body;
    }
}