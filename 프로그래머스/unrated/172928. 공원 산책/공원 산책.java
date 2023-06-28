import java.util.Arrays;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        String[][] parks = new String[park.length][park[0].length()];
        for (int i = 0; i < park.length; i++) {
            String[] parts = park[i].split("");
            for (int j = 0; j < parts.length; j++) {
                parks[i][j] = parts[j];
                if (parts[j].equals("S")) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        int maxx = parks.length - 1;
        int maxy = parks[0].length - 1;

        for (String str : routes) {
            String[] asdf = str.split(" ");
            int steps = Integer.parseInt(asdf[1]);
            int[] backup = Arrays.copyOf(answer, answer.length);
            switch (asdf[0]) {
                case "N":
                    for (int i = 0; i < steps; i++) {
                        if (answer[0] != 0 && !parks[answer[0] - 1][answer[1]].equals("X")) {
                            answer[0]--;
                        } else {
                            answer = Arrays.copyOf(backup, backup.length);
                            break;
                        }
                    }
                    break;
                case "S":
                    for (int i = 0; i < steps; i++) {
                        if (answer[0] < maxx && !parks[answer[0] + 1][answer[1]].equals("X")) {
                            answer[0]++;
                        } else {
                            answer = Arrays.copyOf(backup, backup.length);
                            break;
                        }
                    }
                    break;
                case "W":
                    for (int i = 0; i < steps; i++) {
                        if (answer[1] != 0 && !parks[answer[0]][answer[1] - 1].equals("X")) {
                            answer[1]--;
                        } else {
                            answer = Arrays.copyOf(backup, backup.length);
                            break;
                        }
                    }
                    break;
                case "E":
                    for (int i = 0; i < steps; i++) {
                        if (answer[1] < maxy && !parks[answer[0]][answer[1] + 1].equals("X")) {
                            answer[1]++;
                        } else {
                            answer = Arrays.copyOf(backup, backup.length);
                            break;
                        }
                    }
                    break;
            }
        }

        return answer;
    }
}
