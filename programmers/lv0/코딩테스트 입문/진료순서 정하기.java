import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] emergencySort = new int[emergency.length];
        System.arraycopy(emergency, 0, emergencySort, 0, emergency.length);
        Arrays.sort(emergencySort);
        for (int i=0; i<emergency.length; i++) {
            answer[i] = getPriority(emergencySort, emergency[i]);
        }
        return answer;
    }
    
    private int getPriority(int[] emergencySort, int number) {
        for (int i=0; i<emergencySort.length; i++) {
            if (number == emergencySort[i]) {
                return emergencySort.length - i;
            }
        }
        return -1;
    }
}
