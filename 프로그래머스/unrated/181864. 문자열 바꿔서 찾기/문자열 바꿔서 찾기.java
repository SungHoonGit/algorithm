class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder swapped = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if (c=='A') {
                swapped.append('B');
            } else if ( c == 'B') {
                swapped.append('A');
            }
        }

        if(swapped.toString().contains(pat)) answer=1;
        
        return answer;
    }
}