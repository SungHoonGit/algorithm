class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int height = 3; ; height++) {
            int width = (brown + yellow) / height;
            int innerYellow = (width - 2) * (height - 2);
            
            if (innerYellow == yellow) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        return answer;
    }
}