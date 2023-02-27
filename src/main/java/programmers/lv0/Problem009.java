package programmers.lv0;

public class Problem009 {
    public int[] solution(int[] numbers) {
        boolean validation = numbers.length >= 1 && numbers.length <= 1000;
        int[] answer = new int[numbers.length];
        if (validation) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] >= -10000 && numbers[i] <= 10000) {
                    answer[i] = numbers[i] * 2;
                }
            }
        }
        return answer;
    }
}
