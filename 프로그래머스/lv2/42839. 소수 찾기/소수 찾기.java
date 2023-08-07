import java.util.*;

class Solution {
   public static int solution(String numbers) {
        int answer = 0;
        char[] charArray = numbers.toCharArray();
        boolean[] visited = new boolean[charArray.length];
        Set<Integer> resultSet = new HashSet<>();       

        for (int r = 1; r <= charArray.length; r++) {
            char[] temp = new char[r];
            permutation(charArray, temp, visited, 0, r, resultSet);
        } // for end

        for (int num : resultSet) {
            if (isPrime(num)) {
                // System.out.println(num); // 소수인 경우 출력
                answer++;
            }
        }       

        return answer;
    }

    public static void permutation(char[] arr, char[] temp, boolean[] visited, int depth, int r, Set<Integer> resultSet) {
        if (depth == r) {
            String numStr = new String(temp);
            int number = Integer.parseInt(numStr);
            resultSet.add(number);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp[depth] = arr[i];
                permutation(arr, temp, visited, depth + 1, r, resultSet);
                visited[i] = false;
            }
        }
    } // 완전탐색
    
    // 소수 판별 메소드
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}