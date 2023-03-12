class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] check = {"a", "e", "i", "o", "u"};
        String[] test = new String[my_string.length()];
        for(int i =0; i< my_string.length(); i++) {
            test[i] = my_string.substring(i,i+1);
            for(int j=0; j<check.length; j++) {
            if(test[i].equals(check[j])) {
                 test[i]= "";
                }// if end
            }// for end
        }// for end
        
        for(int i =0; i< my_string.length(); i++) {
            answer += test[i];
        } // for end
        return answer;
    }
}