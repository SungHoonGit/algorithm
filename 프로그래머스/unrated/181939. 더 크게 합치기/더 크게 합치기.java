class Solution {
    public int solution(int a, int b) {
        String str = a+""+b;
        String str2 = b+""+a;
        
        int answer = Integer.parseInt(str);
        int answer2 = Integer.parseInt(str2);
        if(answer<answer2) answer=answer2;
        return answer;
    }
}