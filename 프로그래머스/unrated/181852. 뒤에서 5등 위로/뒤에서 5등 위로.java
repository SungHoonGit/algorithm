class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        num_list = ACS(num_list);
        for(int i =0; i<answer.length; i++) {
            answer[i]=num_list[i+5];
        }
        // for(int i : num_list) {
        //     System.out.print(i + ", ");    
        // }
        
        return answer;
    }
    
    public int[] ACS(int[] num_list){
        int Temp=0;
        for(int i=0; i<num_list.length-1; i++) {
            for( int j=i+1; j<num_list.length; j++) {
                if(num_list[i]>num_list[j]) {
                    Temp=num_list[j];
                    num_list[j]=num_list[i];
                    num_list[i]=Temp;
                }
            }
        }
        return num_list;
    }

    
}