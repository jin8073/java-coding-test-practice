class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int exp = 1;
        while (arr.length > exp) {
            exp *= 2;
        }
        answer = new int[exp];
        for (int i=0; i<answer.length; i++) {
            if (i < arr.length) {
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
}
