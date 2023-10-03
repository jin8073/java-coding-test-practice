import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 2;
        while (n > 1) {
            if (n % number == 0) {
                while (n % number == 0) {
                    n /= number;
                }
                numbers.add(number);
            } else {
                number++;
            }
        }
        answer = new int[numbers.size()];
        for (int i=0; i<numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        return answer;
    }
}
