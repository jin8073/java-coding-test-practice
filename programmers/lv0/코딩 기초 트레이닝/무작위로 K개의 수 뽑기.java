import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> temp = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (!temp.contains(arr[i])) {
                temp.add(arr[i]);
            }
        }
        for (int i=0; i<k; i++) {
            if (i >= temp.size()) {
                answer[i] = -1;
            } else {
                answer[i] = temp.get(i);
            }
        }
        return answer;
    }
}
