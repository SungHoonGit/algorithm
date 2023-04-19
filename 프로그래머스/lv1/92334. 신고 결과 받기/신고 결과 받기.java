import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        //한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
        //유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
        //id_list의 원소는 이용자의 id를 나타내는 문자열이며 알파벳 소문자로만 이루어져 있습니다.


        //신고당한 자의 HashMap을 구현한다.
        //신고당한 자는 신고한 자의 ID HashSet을 갖는다.
        Map<String, HashSet<String>> reportedIDs = new HashMap<>();

        //신고한 자의 '처리 결과 메일 수신 카운트 배열'을 만든다.
        int[] processMailCount = new int[id_list.length];

        //신고한 자의 id와 '처리 결과 메일 수신 카운트 배열' 인덱스 맵을 만든다.
        Map<String, Integer> idIndexMap = new HashMap<>();
        for (int i = 0 ; i < id_list.length ; i++) {
            idIndexMap.put(id_list[i], i);
        }

        //report의 원소는 "이용자id 신고한id"형태의 문자열입니다.
        for (int i = 0 ; i < report.length ; i++) {
            String[] reported = report[i].split(" ");
            if (reportedIDs.get(reported[1]) == null) {
                    reportedIDs.put(reported[1], new HashSet<String>() );
                }
            HashSet<String> set = reportedIDs.get(reported[1]);
            set.add(reported[0]); 
            reportedIDs.put(reported[1], set);
        }

        //해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
        for (int i = 0 ; i < id_list.length ; i++) { 
            Set<String> reporterIDs = reportedIDs.get(id_list[i]);
            if (reporterIDs != null && reporterIDs.size() >= k) {
                Iterator<String> iter = reporterIDs.iterator();
                while(iter.hasNext()) {
                    String reporter = iter.next();
                    processMailCount[idIndexMap.get(reporter)]++;
                }
            }
        }

        answer = processMailCount;

        return answer;
    }
}
