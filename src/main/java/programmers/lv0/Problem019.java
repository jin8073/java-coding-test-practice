package programmers.lv0;

/**
 * 짝수 홀수 개수
 * */
public class Problem019 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int num : num_list) {
            answer[num % 2] += 1;
        }
        return answer;
    }
}
