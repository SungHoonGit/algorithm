class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count =0;
        while(true) {
            count =0;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]>50 && arr[i]%2==0) arr[i]=arr[i]/2;
                else if(arr[i]<50 && arr[i]%2!=0) arr[i]=arr[i]*2+1;
                else {count++;}
                // System.out.print(arr[i] + " ");
            }
            // System.out.printf("\n%d\n ",count);
            if(count==arr.length-1) break;
            answer++;
        } // while end
        
        return answer;
    }
}