class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        int length = 0;
        int sum = 0;
        for (int i=0; i<flag.length; i++) {
            if (flag[i]) {
                length += arr[i]*2;
                sum += arr[i]*2;
            } else {
                length -= arr[i];
            }
        }
        int[] temp = new int[sum];
        int index = 0;
        for (int i=0; i<flag.length; i++) {
            if (flag[i]) {
                for (int j=0; j<arr[i]*2; j++) {
                    temp[index++] = arr[i];
                }
            } else {
                for (int j=0; j<arr[i]; j++) {
                    temp[--index] = 0;
                }
            }
        }
        answer = new int[length];
        System.arraycopy(temp, 0, answer, 0, length);
        return answer;
    }
}
