class Solution {
    public String[] solution(String my_string) {
        String[] my_stringArrar = my_string.split(" ");
        String[] answer = new String[my_stringArrar.length];
        int count =0;
        for( String str : my_stringArrar ) {
            answer[count++] = str;
        }
        
        return answer;
    }
}