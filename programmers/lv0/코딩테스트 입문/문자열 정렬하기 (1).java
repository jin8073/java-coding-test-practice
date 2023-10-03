import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0; i<my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                int number = (int) my_string.charAt(i) - 48;
                numbers.add(number);
            }
        }
        Collections.sort(numbers);
        answer = new int[numbers.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = numbers.get(i);
        }
        return answer;
    }
}
