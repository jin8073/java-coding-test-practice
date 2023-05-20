import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 최댓값 만들기 (1)
 * */
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int first = 0;
        int second = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= first) {
                second = first;
                first = numbers[i];
            } else if (numbers[i] >= second && numbers[i] < first) {
                second = numbers[i];
            }
        }
        answer = first * second;
        return answer;
    }
}
