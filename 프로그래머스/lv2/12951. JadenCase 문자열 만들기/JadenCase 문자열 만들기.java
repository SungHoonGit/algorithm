class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean capitalize = true;

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (capitalize) {
                    sb.append(Character.toUpperCase(c));
                    capitalize = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            } else {
                sb.append(c);
                capitalize = true;
            }
        }

        return sb.toString();
    }
}
