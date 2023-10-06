import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                numbers.add(i);
            }
        }
        answer = new int[numbers.size()];
        for (int i=0; i<numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        return answer;
    }
}
