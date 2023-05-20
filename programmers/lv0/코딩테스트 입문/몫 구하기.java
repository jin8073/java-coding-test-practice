package programmers.lv0;

/**
 * 몫 구하기
 * */
public class Problem006 {
    public int solution(int num1, int num2) {
        boolean validation = (num1 >= 0 && num1 <= 100) && (num2 >= 0 && num2 <= 100);
        int answer = -1;
        if (validation) {
            answer = num1 / num2;
        }
        return answer;
    }
}
