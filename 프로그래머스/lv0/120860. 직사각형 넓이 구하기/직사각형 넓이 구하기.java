class Solution {
    public int solution(int[][] dots) {
        double answer = 0;
        double maxx = dots[0][0];
        double minx = dots[0][0];
        double maxy = dots[0][1];
        double miny = dots[0][1];
        for (int i=0; i<4; i++) {
            if (dots[i][0]>=maxx) { maxx=dots[i][0];}
            if (dots[i][0]<=minx) { minx=dots[i][0];}
            if (dots[i][1]>=maxy) { maxy=dots[i][1];}
            if (dots[i][1]<=miny) { miny=dots[i][1];}
        }
        answer = ((maxx-minx)*(maxy-miny));
        return (int)answer;
    }
}