package programmers.lv0;

/**
 * 점의 위치 구하기
 * */
public class Problem025 {
    public int solution(int[] dot) {
        int answer = 0;
        answer = getAnswer(dot);
        return answer;
    }

    private int getAnswer(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        }
        if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        }
        if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        }
        if (dot[0] > 0 && dot[1] < 0) {
            return 4;
        }
        return -1;
    }
}
