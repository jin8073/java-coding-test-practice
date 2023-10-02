class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for (int length : box) {
            int maxLength = 0;
            for (int i=n; i<=length; i+=n) {
                maxLength = i;
            }
            answer *= maxLength / n;
        }
        return answer;
    }
}
