import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] preArr = new int[arr.length];
        System.arraycopy(arr, 0, preArr, 0, arr.length);
        while(true) {
            for (int i=0; i<arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(arr, preArr)) {
                break;
            } else {
                answer++;
                System.arraycopy(arr, 0, preArr, 0, arr.length);
            }
        }
        return answer;
    }
}
