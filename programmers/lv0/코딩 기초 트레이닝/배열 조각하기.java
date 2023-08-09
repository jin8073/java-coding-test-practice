class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        for(int i=0; i<query.length; i++) {
            int[] newArr = {};
            if (i % 2 == 0) {
                newArr = new int[query[i]+1];
                System.arraycopy(answer, 0, newArr, 0, query[i]+1);
            } else {
                newArr = new int[answer.length-query[i]];
                System.arraycopy(answer, query[i], newArr, 0, answer.length-query[i]);
            }
            answer = newArr;
        }
        return answer;
    }
}
