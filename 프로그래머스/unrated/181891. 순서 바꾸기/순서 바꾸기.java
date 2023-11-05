class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int j=n;
        for(int i=0; i<num_list.length; i++) {
            if((j+i)==num_list.length) j-=num_list.length;
            answer[i] = num_list[i+j];
        }
        return answer;
    }
}