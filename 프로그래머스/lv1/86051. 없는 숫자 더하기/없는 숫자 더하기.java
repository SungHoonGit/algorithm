import java.util.ArrayList;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] number = {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : number) {
            list.add(i);
        }// List 생성
        for(int j : numbers) {
            list.remove(Integer.valueOf(j));
        }// 삭제.
        for(int l = 0; l < list.size(); l++) {
            answer += list.get(l);
        }
        return answer;
    }
}