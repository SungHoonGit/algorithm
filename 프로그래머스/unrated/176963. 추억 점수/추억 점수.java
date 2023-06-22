class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int count = 0;
        int i = 0;
        
        for(String[] arr : photo) {
            count = 0;
            for (String str : arr) {

                for (int j = 0; j < name.length; j++) {
                    String con = name[j];
                    if (str.equals(con)) {
                        // System.out.println(con);
                        count += yearning[j];
                        break;
                    }
                }

            }
            answer[i] = count;
            i++;
        }
        return answer;
    }
}