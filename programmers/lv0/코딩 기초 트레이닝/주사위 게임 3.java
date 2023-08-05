import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        List<Integer> diceNumber = new ArrayList(Arrays.asList(a, b, c, d));
        List<Integer> diceFrequency = new ArrayList<>();
        for (int i=0; i<diceNumber.size(); i++) {
            diceFrequency.add(Collections.frequency(diceNumber, diceNumber.get(i)));
        }
        if (diceFrequency.contains(4)) {
            answer = 1111 * a;
        } else if (diceFrequency.contains(3)) {
            answer = (10 * diceNumber.get(diceFrequency.indexOf(3)) + diceNumber.get(diceFrequency.indexOf(1))) * (10 * diceNumber.get(diceFrequency.indexOf(3)) + diceNumber.get(diceFrequency.indexOf(1)));
        } else if (diceFrequency.contains(2) && !diceFrequency.contains(1)) {
            List<Integer> dice = new ArrayList<>();
            for (int i=0; i<diceNumber.size(); i++) {
                if (!dice.contains(diceNumber.get(i))) {
                    dice.add(diceNumber.get(i));
                }
            }
            answer = (dice.get(0) + dice.get(1)) * Math.abs(dice.get(0) - dice.get(1));
        } else if (diceFrequency.contains(2) && diceFrequency.contains(1)) {
            answer = 1;
            for (int i=0; i<diceFrequency.size(); i++) {
                if (diceFrequency.get(i) == 1) {
                    answer *= diceNumber.get(i);
                }
            }
        } else {
            int min = 7;
            for (int i=0; i<diceNumber.size(); i++) {
                min = min > diceNumber.get(i) ? diceNumber.get(i) : min;
                answer = min;
            }
        }
        return answer;
    }
}
