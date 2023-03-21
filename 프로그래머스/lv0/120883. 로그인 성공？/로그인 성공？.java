class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(int i=0; i<db.length; i++) {
             System.out.print(id_pw[0]);
             System.out.println("="+db[i][0]);
             System.out.print(id_pw[1]);
             System.out.print("="+db[i][1]);     
            if(id_pw[0].equals(db[i][0]) ) {
          
                if(id_pw[1].equals(db[i][1])) {
                    System.out.println("login");     
                    answer = "login";    
                    break;
                } else {
                    System.out.println("wrong pw");     
                    answer = "wrong pw";
                    break;
                }
            } else {
                System.out.println("fail");     
                answer = "fail";               
            }
        }
        return answer;
    }
}