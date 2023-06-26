import java.util.*;
class Solution {
    
public int[] solution(String today, String[] terms, String[] privacies) {
    List<Integer> answerList = new ArrayList<>();

    for (int i = 0; i < privacies.length; i++) {
        String[] privacyTokens = privacies[i].split(" ");
        String targetDate = privacyTokens[0];
        String targetItem = privacyTokens[1];

        for (String term : terms) {
            String[] termTokens = term.split(" ");
            String termItem = termTokens[0];
            String termOffset = termTokens[1];

            if (targetItem.equals(termItem)) {
                String expiryDate = getExpiryDate(targetDate, termOffset);
                if (!isExpired(expiryDate, today)) {
                    answerList.add(i + 1);
                    break;
                }
            }
        }
    }

    int[] answer = new int[answerList.size()];
    for (int i = 0; i < answerList.size(); i++) {
        answer[i] = answerList.get(i);
    }
    
    return answer;
}

private String getExpiryDate(String startDate, String offset) {
    String[] startDateTokens = startDate.split("\\.");
    int year = Integer.parseInt(startDateTokens[0]);
    int month = Integer.parseInt(startDateTokens[1]);
    int day = Integer.parseInt(startDateTokens[2]);
    
    int offsetMonth = Integer.parseInt(offset);
    int offsetYear = offsetMonth / 12;
    offsetMonth %= 12;
    
    year += offsetYear;
    month += offsetMonth;
    if (month > 12) {
        month -= 12;
        year++;
    }
    
    return String.format("%d.%02d.%02d", year, month, day);
}

private boolean isExpired(String expiryDate, String today) {
    String[] expiryDateTokens = expiryDate.split("\\.");
    int expiryYear = Integer.parseInt(expiryDateTokens[0]);
    int expiryMonth = Integer.parseInt(expiryDateTokens[1]);
    int expiryDay = Integer.parseInt(expiryDateTokens[2]);
    
    String[] todayTokens = today.split("\\.");
    int todayYear = Integer.parseInt(todayTokens[0]);
    int todayMonth = Integer.parseInt(todayTokens[1]);
    int todayDay = Integer.parseInt(todayTokens[2]);
    
    if (expiryYear > todayYear) {
        return true;
    } else if (expiryYear == todayYear) {
        if (expiryMonth > todayMonth) {
            return true;
        } else if (expiryMonth == todayMonth) {
            return expiryDay > todayDay;
        }
    }
    
    return false;
}

}