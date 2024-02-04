class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        String str ="";
        boolean newone = true;
        for(int one : arr ){
            newone = true;
            for(int deleteone : delete_list) {
                if ( one == deleteone) {
                    newone = false;
                    break;
                }
            }
            if(newone) {
                str += one +" ";    
            }
            
        } 
        String[] base = str.split(" ");
        int[] answer = new int[base.length];
        for(int i=0; i<base.length; i++) {
            answer[i] = Integer.parseInt(base[i]);
        }
        return answer;
    }

}