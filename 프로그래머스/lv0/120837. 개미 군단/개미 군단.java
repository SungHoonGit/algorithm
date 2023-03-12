class Solution {
    
    public int solution(int hp) {
        int answer = 0;
        int five = five(hp);
        int three = three(hp-five*5);
        int one = one(hp-five*5-three*3);
        return five+three+one;
    }
    
    public int five(int hp) {
        int count = 0;
        while( hp >= count*5) {
            count++;            
        }
        return count-1;
    }

    public int three(int hp) {
        int count = 0;
        while( hp >= count*3) {
            count++;            
        }
        return count-1;
    }
    
    public int one(int hp) {
        int count = 0;
        while( hp >= count) {
            count++;            
        }
        return count-1;
    }    
}