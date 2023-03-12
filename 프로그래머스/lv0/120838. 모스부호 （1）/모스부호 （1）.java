class Solution {
    public String solution(String letter) {
        String answer = "";
       String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morsechange = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<morsechange.length; i++) {
            for(int j=0; j<morse.length; j++) {
                if ( morse[j].equals(morsechange[i])) {
                    answer += (char)('a' + j);
                }
            }
        }
        return answer;
        
        
    }
}