class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] stk = new int[arr.length];
        int index = -1;
        for (int i=0; i<arr.length; i++) {
            if (index < 0) {
                stk[++index] = arr[i];
            } else if (stk[index] == arr[i]) {
                index--;
            } else if (stk[index] != arr[i]) {
                stk[++index] = arr[i];
            }
        }
        if (index < 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[index+1];
            System.arraycopy(stk, 0, answer, 0, index+1);
        }
        return answer;
    }
}
