import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        /*
        int answer = 0;
        HashMap<String, Integer> product = new HashMap<>();
        for(String str : discount) {
            product.put(str,product.getOrDefault(str, 0) +1);
            System.out.println(str  +" , "+product.get(str));   
        }
        System.out.print(product);
        for(int i=0; i<want.length; i++) {
            if(product.containsKey(want[i])) {
                if(number[i]<=product.get(want[i])) {
                    answer++;
                } else { answer =0; break;}
                System.out.println(number[i] +" <= "+product.get(want[i]));   
            }
        }
        */
        int answer = 0;
        System.out.println(discount.length+", "+want.length);
        for(int i=0;i<discount.length-9;i++) {
            int j;
            for(j=0;j<want.length;j++) {
                int check=0;
                for(int k=i;k<i+10;k++) {
                    if(discount[k].equals(want[j])) check++;
                }        
                if(check<number[j]) {
                     break;
                }
            }
           if(j==want.length) answer ++;
        }
        
        return answer;
    }
}