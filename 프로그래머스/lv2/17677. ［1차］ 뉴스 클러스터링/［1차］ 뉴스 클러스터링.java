import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String str1, String str2) {

        String upperStr1 = str1.toUpperCase();
        String upperStr2 = str2.toUpperCase();

        List<String> list1 = createMultiSet(upperStr1);
        List<String> list2 = createMultiSet(upperStr2);
        int unionSize = list1.size()+list2.size();
        System.out.println(createMultiSet(upperStr1) + "-" + createMultiSet(upperStr2));
       
        List<String> intersection = new ArrayList<>();
        // intersection.retainAll(list2); 	[ab, ba, ab]-[ba, ab, ba] 반례
        for (String str : list1) {
            if (list2.contains(str)) {
                intersection.add(str);
                list2.remove(str); // 중복된 값은 한 번만 추가하기 위해 해당 원소를 list2에서 제거
            }
        }        
        
        int intersectionSize = intersection.size();
        unionSize = unionSize - intersectionSize;

        if(unionSize==0) return 65536;
        // System.out.println("교집합 원소 개수: " + intersectionSize + "\n합집합 원소 개수: " + unionSize);
        
        double answer= (double)65536 * intersectionSize / unionSize;
        
        return (int)answer;
    }
    
  public static List<String> createMultiSet(String str) {
        List<String> multiSet = new ArrayList<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);

            if (Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {
                String element = String.valueOf(c1) + String.valueOf(c2);
                multiSet.add(element);
            }

            // 두 글자씩 끊어서 다음 인덱스로 이동
        }

        return multiSet;
    }
}