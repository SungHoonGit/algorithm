class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bab =  {"aya", "ye", "woo", "ma"};
        for(String test : babbling) {
            String test3 = test;
            for (String test2 : bab) {
                test3 = test3.replace(test2,"1");
                System.out.print("test :"+ test);
                System.out.print(" ,test2 :"+ test2);
                System.out.println(" ,test.length() :"+ test.length());
            }// for end
                System.out.println(" ,test3 :"+ test3);
            test3=test3.replace("1","");
            if(test3.length()==0) {
                answer++;
                System.out.println(" answer :"+ answer);
            }// if end

        }
        return answer;
    }
}