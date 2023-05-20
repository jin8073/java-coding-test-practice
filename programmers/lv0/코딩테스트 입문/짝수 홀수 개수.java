/**
 * 짝수 홀수 개수
 * */
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int num : num_list) {
            answer[num % 2] += 1;
        }
        return answer;
    }
}
