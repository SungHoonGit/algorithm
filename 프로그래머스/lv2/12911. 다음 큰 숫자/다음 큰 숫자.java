class Solution {
    public int solution(int n) {
         int a = Integer.bitCount(n);
          while (Integer.bitCount(++n) != a) {}
          return n;
    }
}