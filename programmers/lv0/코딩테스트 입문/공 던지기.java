class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        for (int i=1; i<k; i++) {
            answer += 2;
        }
        answer = answer % numbers.length;
        if (answer == 0) {
            answer = numbers.length;
        }
        return answer;
    }
}
