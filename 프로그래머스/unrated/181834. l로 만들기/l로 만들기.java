class Solution {
    public String solution(String myString) {
          char[] charArray = myString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] < 'l') {
                charArray[i] = 'l';
            }
        }

        return new String(charArray);
    }
}