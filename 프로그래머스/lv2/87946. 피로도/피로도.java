class Solution {
    
    private int max = Integer.MIN_VALUE;
    public int solution(int k, int[][] dungeons) {

        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited);

        return max;

    }

    public void dfs(int k, int[][] dungeons, boolean[] visited) {
        int count = 0;
        // System.out.println("0. dfs "+visited.length);        
        for(int i = 0; i<visited.length; i++) {
            // System.out.print(" visited["+i+"] : " +visited[i] );
            if(visited[i]) {
                count++;
                // System.out.println("\n1. visited["+i+"] : " +visited[i] + " count : " + count );    
            }
        } // for end

        for(int i = 0; i<dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= k) {
                // System.out.println("\n2. visited["+i+"] : " + visited[i] + " dungeons[i][0] : "+ dungeons[i][0]+ " k : " + k );  
                visited[i] = true;
                k -= dungeons[i][1];
                // System.out.println("2-1. visited["+i+"] : " + visited[i] + " dungeons[i][0] : "+ dungeons[i][0]+ " k : " + k );  
                dfs(k, dungeons, visited);
                // System.out.println("------------");  
                k += dungeons[i][1];
                visited[i] = false;
            }
        } // for end
        
        if(count > max) {
            max = count;
            // System.out.println("\n****** max : " + max + " count : " + count );    
        }
        
    }
}
