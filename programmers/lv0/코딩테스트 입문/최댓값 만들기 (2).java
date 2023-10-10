import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> minus = new ArrayList<>();
        ArrayList<Integer> plus = new ArrayList<>();
        for (int number : numbers) {
            if (number >= 0) {
                plus.add(number);
            } else {
                minus.add(number);
            }
        }
        Collections.sort(plus);
        Collections.sort(minus);
        if (minus.size() > 1 && plus.size() > 1) {
            int plusX = plus.get(plus.size()-1) * plus.get(plus.size()-2);
            int minusX = minus.get(0) * minus.get(1);
            answer = plusX < minusX ? minusX : plusX;
        } else if (minus.size() > 1) {
            answer = minus.get(0) * minus.get(1);
        } else if (plus.size() > 1) {
            answer = plus.get(plus.size()-1) * plus.get(plus.size()-2);
        } else {
            answer = plus.get(0) * minus.get(0);
        }
        return answer;
    }
}
