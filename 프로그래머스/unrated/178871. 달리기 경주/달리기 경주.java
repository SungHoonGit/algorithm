import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerRanks = new HashMap<>(); // 각 선수의 등수를 저장하는 Map
        List<String> playerList = new ArrayList<>(); // 선수들의 순서를 저장하는 List

        // 초기 등수 설정 및 선수 리스트 초기화
        for (int i = 0; i < players.length; i++) {
            String player = players[i];
            playerRanks.put(player, i + 1); // 선수의 초기 등수 설정
            playerList.add(player); // 선수 리스트에 추가
        }

        // 해설진의 부른 이름에 따라 등수 변경
        for (String calling : callings) {
            int index = playerRanks.get(calling) - 1; // 부른 이름의 인덱스 (등수에 맞는 인덱스로 변환)
            if (index > 0) {
                String temp = playerList.get(index - 1); // 앞에 있는 선수의 이름
                playerList.set(index - 1, calling); // 부른 이름과 앞에 있는 선수의 순서 변경
                playerList.set(index, temp);
                playerRanks.put(calling, playerRanks.get(temp)); // 등수 Map 업데이트
                playerRanks.put(temp, playerRanks.get(temp) + 1);
            }
        }

        String[] result = new String[playerList.size()];
        for (int i = 0; i < playerList.size(); i++) {
            result[i] = playerList.get(i);
        }
        return result;
    }
}
