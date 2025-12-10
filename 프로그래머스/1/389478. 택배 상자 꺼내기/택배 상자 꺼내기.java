class Solution {
    public int solution(int n, int w, int A) {
        
        // A를 0-based index 로 변환
        long k = A - 1;
        long layer = k / w;             // A의 층
        int posInLayer = (int)(k % w);  // 층 내 위치

        // A가 위치한 열 계산 (0 = 왼쪽)
        int col;
        if (layer % 2 == 0) {
            col = posInLayer;          // 왼 -> 오른쪽 배치
        } else {
            col = w - 1 - posInLayer;  // 오른 -> 왼쪽 배치
        }

        long totalLayers = (n + w - 1) / w;
        int count = 1;  // A 자신 포함

        // A 위의 모든 층 검사
        for (long L = layer + 1; L < totalLayers; L++) {

            long startIndex = L * (long) w;
            long remain = n - startIndex;
            int size = (int)Math.min(w, Math.max(0L, remain)); // 실제 채워진 칸 수

            if (size <= 0) continue;

            if (L % 2 == 0) {
                // 짝수층 (왼 → 오)
                if (col < size) count++;
            } else {
                // 홀수층 (오 → 왼)
                int leftmostFilledCol = w - size;
                if (col >= leftmostFilledCol) count++;
            }
        }

        return count;
        
    }
}

// 13/3=4  13%3=1 6