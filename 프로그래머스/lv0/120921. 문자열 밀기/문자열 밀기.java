import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String[] a = A.split("");
        String[] b = B.split("");
        
	    Queue<String> queue = new LinkedList<>(); 	// String형 queue 선언, Linkedlist 이용 
        Queue<String> queue2 = new LinkedList<>(); 	// String형 queue 선언, Linkedlist 이용 
        for ( int i = 0; i<a.length; i++) {
            queue.add(a[a.length-i-1]);     // queue에 값 1 추가
            queue2.add(b[b.length-i-1]);     // queue에 값 1 추가
        }// for end
        
        for(int i=0; i<queue.size(); i++) {
            if (queue.equals(queue2)) {
                System.out.print("queue"+queue);
                System.out.print("queue2"+queue2);
                System.out.println(answer);  
                break;
            } else {
                queue.add(queue.peek());
                queue.remove();
                System.out.print("queue"+queue);
                System.out.print("queue2"+queue2);                
                System.out.println(answer);    
                answer++;
            }
        }// for end

        if ( answer ==queue.size()) {
            answer = -1;
        } // 돌려도 안될 경우.

        return answer;
    }
}