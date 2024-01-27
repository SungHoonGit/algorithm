import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {

        int count=0;
        boolean check = true;
        
        for(String str : str_list) {
            if(str.equals("l") ){
                check = true;
                break;
            } else if(str.equals("r")) {
                check = false;
                break;
            }
            count++;
        }
        if(count == str_list.length) count =0; // l r check;
        
        if(check) { 
            str_list = Arrays.copyOfRange(str_list, 0, count);
        }else {
            str_list = Arrays.copyOfRange(str_list, count+1, str_list.length);
        }
        
        return str_list;
    }
}