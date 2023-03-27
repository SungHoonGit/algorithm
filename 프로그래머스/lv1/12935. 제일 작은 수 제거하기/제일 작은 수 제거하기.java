import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1인 경우 -1을 리턴합니다.
        if (arr.length == 1) {
            return new int[]{-1};
        }
        
        // 가장 작은 값을 찾습니다.
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // 가장 작은 값의 인덱스를 찾습니다.
        int minIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                minIndex = i;
                break;
            }
        }
        
        // 가장 작은 값을 제외한 새로운 배열을 만듭니다.
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                list.add(arr[i]);
            }
        }
        
        // 새로운 배열이 빈 배열인 경우 -1을 리턴합니다.
        if (list.size() == 0) {
            return new int[]{-1};
        }
        
        // 새로운 배열을 int[] 배열로 변환해서 리턴합니다.
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}