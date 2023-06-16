class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; ++i) {
                System.out.println(food[i]/2);
            if(food[i]/2>=1) {
                for(int j=0; j<food[i]/2; j++) {
                    answer+=i;
                }
            }
        }
        StringBuilder sb = new StringBuilder(answer).reverse();
        answer += "0" + sb;
        
        return answer;
    }
}