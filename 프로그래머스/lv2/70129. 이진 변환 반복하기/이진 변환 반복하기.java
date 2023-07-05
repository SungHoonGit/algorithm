class Solution {
    public static int[] solution(String s) {
        int a = 0;
        int b = 0;
        while( check(s) ) {
            a += getCount(s);

            s = s.replaceAll("0", "");
            int len = s.length();
            s = Integer.toBinaryString(len);
            // System.out.println(s);

            b  ++;
        }

        return new int[] {b,a};
    }

    public static boolean check(String s) {
        if( s.length() == 1 ) {
            if( stoi(s) == 1 )
                return false;
        }

        return true;
    }

    public static int getCount(String s) {
        int count = 0;

        for(char ch : s.toCharArray() ) {
            int tmp = ch-'0';
            if( tmp == 0 ) {
                count ++;
            }
        }

        return count;
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }
}