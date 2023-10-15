class Solution {
    public int solution(String number) {
        int digitSum = 0;
        for (char digit : number.toCharArray()) {
            digitSum += Character.getNumericValue(digit);
        }
        
        int remainder = digitSum % 9;
        
        return remainder;
    }
}