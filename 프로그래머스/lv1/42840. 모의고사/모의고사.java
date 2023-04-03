import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int A = 0;
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int B = 0;
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int C = 0;
        for(int i=0; i<answers.length; i++) {
            if(answers[i]==a[i%a.length]) A++;
            if(answers[i]==b[i%b.length]) B++;
            if(answers[i]==c[i%c.length]) C++;
        } // 정답수 
        
        int[] answer = {A, B, C}; // 정답수 

        HashMap<Integer,Integer> map = new HashMap<>(); // HashMap 생성.
        for(int i=0;i<answer.length;i++) {
            map.put(i+1, answer[i]);
        }// 최대값 Hashmap setting
        Integer maxValue = Collections.max(map.values());
        
        List<Integer> list = new ArrayList<>(); // list 생성
        for(Integer i : map.keySet()){ //저장된 key값 확인
            if(maxValue.equals(map.get(i))) { // ***** Integer 은 비교연산자 == 시 오류
                list.add(i);
            }
        }
        Collections.sort(list);// 오름차순으로 정렬
        
        int[] arr1 = new int[list.size()];// ArrayList to int[]
        for (int i = 0 ; i < list.size() ; i++) 
            arr1[i] = list.get(i).intValue();
        return arr1;
    }
}