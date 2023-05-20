package programmers.lv0;

/**
 * 머쓱이보다 키 큰 사람
 * */
public class Problem002 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int heightOfClassmate : array) {
            if (heightOfClassmate > height) {
                answer++;
            }
        }
        return answer;
    }
}
