class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int element : array) {
            while (element > 0) {
                if (element % 10 == 7) {
                    answer++;
                }
                element /= 10;
            }
        }
        return answer;
    }
}
