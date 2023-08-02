import java.util.*;

class Solution {
    public static int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
        // return bfs(numbers, target);
    }
    
    private static int dfs(int[] numbers, int target, int sum, int current) {
        int ans = 0;

        if (current == numbers.length) {
            if (target == sum) {
                return 1;
            }
            return 0;
        }

        ans += dfs(numbers, target, sum + numbers[current], current + 1);
        ans += dfs(numbers, target, sum + numbers[current] * -1, current + 1);

        return ans;
    } // DFS 깊이 우선 탐색
    
    private static int bfs(int[] numbers, int target) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, numbers[0]));
        q.add(new Pair(0, numbers[0] * -1));

        int answer = 0;

        while (!q.isEmpty()) {
            Pair p = q.poll();

            if (p.position == numbers.length - 1) {
                if (p.sum == target) {
                    answer++;
                }
                continue;
            }

            int nPosition = p.position + 1;
            if (nPosition >= numbers.length) {
                continue;
            }

            q.add(new Pair(nPosition, p.sum + numbers[nPosition]));
            q.add(new Pair(nPosition, p.sum + numbers[nPosition] * -1));
        }

        return answer;
    } // BFS 너비 우선 탐색



    private static class Pair {
        int position;
        int sum;

        public Pair(int position, int sum) {
            this.position = position;
            this.sum = sum;
        }
    } 

}