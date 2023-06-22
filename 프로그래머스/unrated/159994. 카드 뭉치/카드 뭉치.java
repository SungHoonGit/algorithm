class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int i = 0;
        int j = 0;
        for(String g : goal) {
            if( i < cards1.length && g.equals(cards1[i])){
                i++;
            } else if ( j < cards2.length && g.equals(cards2[j])) {
                j++;
            } else { answer = "No"; }
        }
        return answer;
    }
}