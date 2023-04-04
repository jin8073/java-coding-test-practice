package programmers.lv0;

/**
 * 옷가게 할인 받기
 * */
public class Problem030 {
    public int solution(int price) {
        int answer = 0;
        double discountedPrice = price - getDiscount(price);
        answer = (int) discountedPrice;
        return answer;
    }

    public double getDiscount(int price) {
        if (price >= 500000) {
            return price * 0.2;
        }
        if (price >= 300000) {
            return price * 0.1;
        }
        if (price >= 100000) {
            return price * 0.05;
        }
        return 0;
    }
}
