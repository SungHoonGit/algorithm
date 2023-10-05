class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for (int i = s; i <= e; i++) {
                if (i % k == 0) { // i가 k의 배수인 경우
                    arr[i]++;
                }
            }
        }
        
        return arr;
    }
}