class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int space = 0;
        for(int[] querie : queries) {
            space = arr[querie[0]];
            arr[querie[0]] = arr[querie[1]];
            arr[querie[1]] = space;
        }
        return arr;
    }
}