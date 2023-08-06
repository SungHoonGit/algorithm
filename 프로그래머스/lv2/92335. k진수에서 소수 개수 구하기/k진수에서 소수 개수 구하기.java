class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        long kBasedNum = convertToKBased(n, k); // n을 k진수로 변환하여 long 타입으로 저장
        String[] nums = String.valueOf(kBasedNum).split("0"); // 0을 기준으로 문자열을 분리
        // System.out.println(kBasedNum);

        // 각 문자열이 소수인지 확인하고 조건에 맞는 소수의 개수를 세기
        for (String numStr : nums) {
            // System.out.print(numStr + " ");
            if (numStr.isEmpty()) continue;
            if (isPrime( Long.parseLong(numStr))) { // k 진수를 10진수로
                answer++;
                // System.out.println(convertToDecimal(numStr, k) + " ");
            }
            
        }

        return answer;
    }

    // 10진수 n을 k진수로 변환하는 메소드
    private long convertToKBased(int n, int k) {
        long result = 0;
        long power = 1;

        while (n > 0) {
            result += (n % k) * power;
            power *= 10;
            n /= k;
        }

        return result;
    }

    // 소수인지 확인하는 메소드
    private boolean isPrime(long num) {
        if (num < 2) {
            return false;
        } // if end
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            } // if end
        } // for end
        
        return true;
    } // isPrime
           

    /* private int convertToDecimal(String numStr, int k) {
        
        if (numStr.isEmpty()) {
            return 0;
        }
        System.out.println(numStr + "convertToDecimal " + Integer.parseInt(numStr, k) );
        return Integer.parseInt(numStr, k);
    } // 다시 10 진수로 만드는줄
    */
}
