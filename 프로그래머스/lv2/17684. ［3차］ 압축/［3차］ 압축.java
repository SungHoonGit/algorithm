import java.util.*;

class Solution {
    
    public int[] solution(String msg) {

        List<Integer> compressed = compress(msg);
        System.out.println("Compressed: " + compressed);
        
        return convertListToArray(compressed);
    }

    public static List<Integer> compress(String input) {
        Map<String, Integer> dictionary = new HashMap<>();
        List<Integer> compressed = new ArrayList<>();
        int dictSize = 1; // 초기 사전 크기: A부터 Z까지

        for (char c = 'A'; c <= 'Z'; c++) {
            dictionary.put(Character.toString(c), dictSize++);
        }
        // System.out.println(dictionary);
        String current = "";
        for (char c : input.toCharArray()) {
            String next = current + c;
            if (dictionary.containsKey(next)) {
                current = next;
            } else {
                compressed.add(dictionary.get(current));
                dictionary.put(next, dictSize++);
                current = Character.toString(c);
            }
        }

        if (!current.equals("")) {
            compressed.add(dictionary.get(current));
        }

        return compressed;
    }
    
    public static int[] convertListToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
    
}
