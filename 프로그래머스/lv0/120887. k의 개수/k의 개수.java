class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        while (i<=j) {
            String test = i+"";
            if (test.contains(k+"")) {
                if(test.length()>1) {
                    char[] test2 = test.toCharArray();
                    for(int a = 0; a<test2.length; a++) {
                        if(test2[a]- '0' == k) { 
                            answer ++;
                        }
                    } // 2자리 이상일 경우 각자리수에서 찾아보기.
                } else {
                    answer ++;
                } // 1자리일때.. 마무리

            }
            i++;
        }
        return answer;
    }
}