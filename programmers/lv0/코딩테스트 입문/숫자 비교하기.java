package programmers.lv0;

/**
 * 숫자 비교하기
 * */
public class Problem008 {
    public int solution(int num1, int num2) {
        boolean validation = (num1 >= 0 && num1 <= 10000) && (num2 >= 0 && num2 <= 10000);
        int answer = 0;
        if (validation) {
            answer = (num1 == num2)? 1 : -1;
        }
        return answer;
    }
}
