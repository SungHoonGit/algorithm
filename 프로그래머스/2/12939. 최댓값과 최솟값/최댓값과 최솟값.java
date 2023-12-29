class Solution {
    public String solution(String s) {
        String answer = "";
        String[] test = s.split(" ");
        int base = Integer.parseInt(test[0]);
        int min =base ; int max = base;
        
        for(String str : test) {
            int intest = Integer.parseInt(str);
            if(min> intest) min = intest;
            if(max< intest) max = intest;
        }
        answer = min + " " +max;
        return answer;
    }
}