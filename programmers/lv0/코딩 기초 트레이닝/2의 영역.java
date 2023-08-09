class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int index1 = -1;
        int index2 = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                index1 = index1 == -1 ? i : index1;
                index2 = i;
            }
        }
        if (index1 == -1) {
            return new int[]{-1};
        } else {
            answer = new int[index2 - index1 + 1];
        }
        for (int i=index1; i<=index2; i++) {
            answer[i-index1] = arr[i];
        }
        return answer;
    }
}
