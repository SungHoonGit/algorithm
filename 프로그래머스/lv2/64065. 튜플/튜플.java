import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Solution {
    public int[] solution(String s) {

        String sw = s.substring(2,s.length()-2);        
        String[] strArr = sw.split("\\},\\{");
        HashMap<Integer, Integer> hap = new HashMap<>();                           
        // int[][] arr = new int[strArr.length][];
        for (int i = 0; i < strArr.length; i++) {
            // 양 끝의 중괄호와 공백을 제거하고 각 요소를 정수로 변환하여 배열로 만듦
            String[] numStrArr = strArr[i].replace("{", "").replace("}", "").trim().split(",");
            // System.out.println("numStrArr = " +Arrays.toString(numStrArr));
            // arr[i] = new int[numStrArr.length];
            for (int j = 0; j < numStrArr.length; j++) {
                int key = Integer.parseInt(numStrArr[j]);
                // arr[i][j] = key;
                hap.put(key, hap.getOrDefault(key, 0) + 1);
            }
        }
        // System.out.println(hap);
        // System.out.println(Arrays.deepToString(arr));
        
           // 맵의 값을 크기별로 정렬하여 리스트에 저장
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(hap.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // 정렬된 숫자들을 배열로 변환
        int[] answer = sortedList.stream().mapToInt(Map.Entry::getKey).toArray();

        return answer;
    }
}