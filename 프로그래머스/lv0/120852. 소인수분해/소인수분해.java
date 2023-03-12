import java.util.*;

class Solution {
    public int[] solution(int n) {

        int i=2;
        int count = 0;

        Set<Integer> set = new HashSet<>();
            // set의 자료 구조를 사용하는 것이다.
            // set은 중복된 값을 중복 저장할 수 없기 때문에
            // 중복된 값은 자동으로 처리해 중복되지 않은
            // 데이터만 저장된다. (다른 set 구조를 사용해도 된다.)
       while (n !=1  ) {
            if (n%i ==0) {
            n = n/i;
            set.add(i);
            count ++;
                
          } else {
           i ++ ;    
           }
       } // while end
        // 배열의 있는 값을 하나씩 뽑아주준다.

		int [] newArr = new int [set.size()];
		Iterator<Integer> it = set.iterator();
        i=0;
        while (it.hasNext()){
            newArr[i] = it.next();
            i++;
        }
        Arrays.sort(newArr);

        	//위 처럼 새로운 배열을 만들어서 다시 set으로 넣어주면
		// 다시 배열로도 사용할 수 있다
        return newArr;
    }

}


        // 배열의 크기를 구하고 
//         int[] answer = new int[count];
//         n = m;
//         i =2;
//         count = 0;
//         int j = 0;
//        while (n !=1  ) {
//            if (n%i ==0) {
//             n = n/i;
            
//              answer[count] = i;
//                count ++;
//           } else {
//            i ++ ;    
//            }
//        } // while end   
//         // 그 크기의 배열 answer 에 소인수분해 값 넣기.
        