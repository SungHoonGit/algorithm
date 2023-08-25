class Solution {
    public int[][] solution(int n) {
        int[][] result = new int[n][n];
        
        int num = 1;
        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;
        
        while (num <= n * n) {
            // 오른쪽 방향으로 숫자 채우기
            for (int col = colStart; col <= colEnd; col++) {
                result[rowStart][col] = num++;
            }
            rowStart++;
            
            // 아래쪽 방향으로 숫자 채우기
            for (int row = rowStart; row <= rowEnd; row++) {
                result[row][colEnd] = num++;
            }
            colEnd--;
            
            // 왼쪽 방향으로 숫자 채우기
            for (int col = colEnd; col >= colStart; col--) {
                result[rowEnd][col] = num++;
            }
            rowEnd--;
            
            // 위쪽 방향으로 숫자 채우기
            for (int row = rowEnd; row >= rowStart; row--) {
                result[row][colStart] = num++;
            }
            colStart++;
        }
        
        return result;                
    }
                
    

}