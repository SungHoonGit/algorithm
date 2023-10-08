class Solution {
    public int solution(String my_string, String is_prefix) {
        if (is_prefix.length() > my_string.length()) {
            return 0;
        }
        
        String substring = my_string.substring(0, is_prefix.length());
        
        if (substring.equals(is_prefix)) {
            return 1;
        } else {
            return 0;
        }
    }
}