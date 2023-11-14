class Solution {
    public String solution(String myString) {
        char[] charArray = myString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'A') {
                charArray[i] = 'A';
            } else if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }

        return new String(charArray);
    }
}