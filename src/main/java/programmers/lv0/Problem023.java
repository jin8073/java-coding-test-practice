package programmers.lv0;

/**
 * 피자 나눠 먹기 (1)
 * */
public class Problem023 {
    public int solution(int n) {
        int answer = 0;
        answer = n % 7 == 0 ? n / 7 : n / 7 + 1;
        return answer;
    }
}
