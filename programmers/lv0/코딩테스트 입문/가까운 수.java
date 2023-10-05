import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int interval = 100;
        for (int element : array) {
            if (Math.abs(n-element) < interval) {
                interval = Math.abs(n-element);
                answer = element;
            } else if (Math.abs(n-element) == interval) {
                answer = answer < element ? answer : element;
            }
        }
        return answer;
    }
}
