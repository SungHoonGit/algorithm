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
                    if (isExpired(expiryDate, today)) {
                        answerList.add(i + 1);
                        break;
                    }
                }
            }
        }
        
  
        System.out.print(answerList);
        int[] answer = new int[answerList.size()];
        for (int k = 0; k < answerList.size(); k++) {
            answer[k] = answerList.get(k);
        }   
        
        return answer;
    }
    
    
    public String getExpiryDate(String startDate, String offset) {
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
    
    public boolean isExpired (String privacies, String today) {
        String[] changedate = privacies.split("\\.");
        String[] todays = today.split("\\.");

        int yearComparison = changedate[0].compareTo(todays[0]);
        int monthComparison = changedate[1].compareTo(todays[1]);
        int dayComparison = changedate[2].compareTo(todays[2]);

        if (yearComparison > 0 || (yearComparison == 0 && monthComparison > 0) ||
            (yearComparison == 0 && monthComparison == 0 && dayComparison > 0)) {
            return false; // 유통기한이 지남
        }

        return true; // 유통기한이 지나지 않음
        
    }
}