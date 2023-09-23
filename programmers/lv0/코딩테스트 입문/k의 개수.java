class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int num=i; num<=j; num++) {
            int number = num;
            while (number > 0) {
                if (number % 10 == k) {
                    answer++;
                }
                number /= 10;
            }
        }
        return answer;
    }
}
