class Solution {
    public String[] solution(String[] quiz) {
      String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] equation = quiz[i].split(" ");
            int x = Integer.parseInt(equation[0]);
            int y = Integer.parseInt(equation[2]);
            int z = Integer.parseInt(equation[4]);
            String operator = equation[1];
            int result = 0;
            if (operator.equals("+")) {
                result = x + y;
            } else if (operator.equals("-")) {
                result = x - y;
            }
            if (result == z) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}