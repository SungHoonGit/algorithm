class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        while( my_string.length() >= is_suffix.length() ) {
            if(my_string.equals(is_suffix)) {
              answer = 1;break;  
            } else {
              my_string = my_string.substring(1);  
            } 
            System.out.println(my_string);
        }
        
        return answer;
    }
}