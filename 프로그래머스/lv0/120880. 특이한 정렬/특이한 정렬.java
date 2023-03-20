import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int count=0;
        Arrays.sort(numlist);
         Map<Double, Integer> hashMap = new HashMap<Double, Integer>();
        for ( int i=0; i<numlist.length; i++) {
            if(numlist[i]-n<0) {
                hashMap.put(((numlist[i]-n)*-1)+0.5, numlist[i]);
            } else {
                hashMap.put((double)numlist[i]-n, numlist[i]);   
            }
        } // for end // key, value 설정하기.
        
        List<Double> keySet = new ArrayList<>(hashMap.keySet());
        Collections.sort(keySet); // 크기별로 배열 정렬
        
        for (double key : keySet) {
            answer[count] = hashMap.get(key);
            System.out.print("Key : " + key);
            System.out.println(", Val : " + hashMap.get(key));
            count++;
        } // answer 에 옮겨담기.
        
        return answer;
    }
}