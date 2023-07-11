import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] citations) {
        PriorityQueue<Integer> citationQ = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < citations.length; i++) {
            citationQ.add(citations[i]);
        }

        int answer = 0;

        while (!citationQ.isEmpty() && answer < citationQ.peek()) {
            citationQ.poll();
            answer++;
        }

        return answer;
    }
}