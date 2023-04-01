class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // 비트연산 정리자.
            if(answer[i].length()<n) {
                for(int j=0; j<=(n-answer[i].length()); j++){
                    answer[i]="0"+answer[i];    
                }
            }// 앞부분 0 일경우.
            System.out.println(answer[i]);
            answer[i] = answer[i].replaceAll("1", "#").replaceAll("0", " ");
        }
        
        
        return answer;
    }
}

