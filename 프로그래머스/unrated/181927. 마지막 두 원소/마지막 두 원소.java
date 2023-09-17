class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int count = 0;
        for(int num : num_list) {
            answer[count++]=num;
        }
        int last = num_list[num_list.length-1];
        int last2 = num_list[num_list.length-2];
         answer[answer.length-1] = (last>last2) ? last-last2 : last*2 ;

        return answer;
    }
}