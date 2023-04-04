import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] answer = new double[N+1]; // add clear level.
        int[] result = new int[N];
        for(int i : stages) {
            for(int j = 0; j<i; j++) {
                answer[j]++;
            }
        }
        System.out.print(Arrays.toString(answer));
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        for(int i=0; i<answer.length-1; i++) {
            if(answer[i]==0.0){   // 도달하지 못한 레벨.
                map.put(i+1, 0.0);    
            } else {
                map.put(i+1, (answer[i]-answer[i+1])/answer[i]);    
            }
        } // 실패 확률.
        System.out.print(map);
        List<Integer> listKeySet = new ArrayList<>(map.keySet()); // List 생성.
        Collections.sort(listKeySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1)))); // 비교 
        int cnt=0;
        for(int key : listKeySet) {
            result[cnt] = key;
            cnt++;
        }
        return result;
    }
}