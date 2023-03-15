package programmers.lv0;

/**
 * 분수의 덧셈
 * */
public class Problem011 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        boolean validation = (numer1 > 0 && numer1 < 1000) && (numer2 > 0 && numer2 < 1000)
                && (denom1 > 0 && denom1 < 1000) && (denom2 > 0 && denom2 < 1000);
        int[] answer = new int[2];
        if (validation) {
            answer[0] = numer1 * denom2 + numer2 * denom1;
            answer[1] = denom1 * denom2;
            int min = answer[0] < answer[1]? answer[0] : answer[1];
            int gcd = getGCD(answer[0], answer[1]);
            answer[0] /= gcd;
            answer[1] /= gcd;
        }
        return answer;
    }

    public int getGCD(int num1, int num2) {
        int min = num1 < num2? num1 : num2;
        int gcd = 0;
        for (int i=1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
