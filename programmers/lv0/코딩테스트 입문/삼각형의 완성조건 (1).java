package programmers.lv0;

/**
 * 삼각형의 완성조건 (1)
 * */
public class Problem032 {
    public int solution(int[] sides) {
        int answer = 0;
        int max_side = 0;
        int sum_side = 0;
        for (int side : sides) {
            if (side > max_side) {
                max_side = side;
            }
            sum_side += side;
        }
        if (max_side < sum_side - max_side) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
