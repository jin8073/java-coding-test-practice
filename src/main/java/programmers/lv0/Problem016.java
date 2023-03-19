package programmers.lv0;

/**
 * 양꼬치
 * */
public class Problem016 {
    public int solution(int n, int k) {
        int answer = 0;
        k -= n/10;
        answer = n * 12000 + k * 2000;
        return answer;
    }
}
