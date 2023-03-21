class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int remainder = 0;

        while (coupon > 0) {
            answer += coupon / 10; // 쿠폰 사용
            remainder += coupon % 10; // 남은 쿠폰
            
            if(remainder >= 10) {
                answer ++;
                coupon = coupon+10;
                remainder = remainder-10;
            } // 쿠폰이 10개 넘으면 한마리더~
            System.out.print("chicken : "+chicken);
            System.out.print(", coupon : "+coupon);
            System.out.println(", remainder : "+remainder);
            coupon /= 10;
        }
        return answer;
    }
}