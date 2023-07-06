class Solution {
    public int solution(int n) {
        int count = countOnes(n);
        int m = n + 1;

        while (true) {
            if (countOnes(m) == count) {
                return m;
            }
            m++;
        }
    }
    
    private int countOnes(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num = num >>> 1;
        }
        return count;
    }
}