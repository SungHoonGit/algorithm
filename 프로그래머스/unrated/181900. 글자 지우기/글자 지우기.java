import java.util.Arrays;


class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);


        // 배열을 정렬하여 인덱스 순서를 유지합니다.
        Arrays.sort(indices);

        for (int i = indices.length - 1; i >= 0; i--) {
            int indexToRemove = indices[i];
            if (indexToRemove >= 0 && indexToRemove < sb.length()) {
                sb.deleteCharAt(indexToRemove);
            }
        }
        
        return sb.toString();
    }
}