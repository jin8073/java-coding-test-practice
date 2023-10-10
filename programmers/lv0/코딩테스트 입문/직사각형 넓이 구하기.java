class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxX = -256;
        int minX = 256;
        int maxY = -256;
        int minY = 256;
        for (int[] dot : dots) {
            maxX = maxX < dot[0] ? dot[0] : maxX;
            minX = minX > dot[0] ? dot[0] : minX;
            maxY = maxY < dot[1] ? dot[1] : maxY;
            minY = minY > dot[1] ? dot[1] : minY;
        }
        answer = (maxX - minX) * (maxY - minY);
        return answer;
    }
}
