import java.util.LinkedList; //import
import java.util.Queue; //import
import java.util.Stack; //import

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언, linkedlist 이용
        for(int i=0; i<progresses.length; i++) {
            int complite = progresses[i];
            int count =0;
            while ( complite < 100 ) {
                complite +=speeds[i];
                count++;
            }
            queue.add(count);     // stack에 값 count 추가
            // System.out.println(count);
        }
        // System.out.println(queue);
        
        Stack<Integer> stack = new Stack<>(); //int형 스택 선언
        int Maxprs = queue.peek();
        queue.poll();
        int scount = 1;
        while(!queue.isEmpty()) {
             System.out.println(Maxprs);       // queue의 첫번째 값 참조
            if(Maxprs < queue.peek()) {
                Maxprs=queue.peek();
                // System.out.println(scount + " ------------ ");
                stack.add(scount);
                scount = 1;
            } else {
                scount ++;
            } 
            queue.poll();
            if(queue.isEmpty()) {
                stack.add(scount);
            }
            // System.out.println(queue);
        }
        // System.out.println("--------\n"+stack);
        int[] answer = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            answer[index] = stack.pop();
            index--;
        } // stack --> int[]

        return answer;
    }
}