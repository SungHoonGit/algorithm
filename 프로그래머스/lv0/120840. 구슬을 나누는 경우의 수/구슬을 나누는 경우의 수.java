import java.lang.Math;

class Solution {
    
    public int solution(double balls, double share) {
        double answer = 0;
        answer = factory(balls)/(factory(balls-share)*factory(share));
        return (int)Math.round(answer);
    }
    
    public double factory(double n) {        
        double result = 1;
        for(double i=1; i<=n; i++) {
            result *= i;
        } // for end
        return result;
    } // factory end
    
    public double nanugi(double a, double b) {
        return a;
    }
}