class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        if (getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])) {
            answer = 1;
        } else if (getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3])) {
            answer = 1;
        } else if (getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2])) {
            answer = 1;
        }
        return answer;
    }
    
    private double getSlope(int[] a, int[] b) {
        return (double) (b[1] - a[1]) / (double) (b[0] - a[0]);
    }
}
