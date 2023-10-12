class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sumOfSide = sides[0] + sides[1];
        int big = sides[0] > sides[1] ? sides[0] : sides[1];
        int small = sides[0] < sides[1] ? sides[0] : sides[1];
        answer = sumOfSide - big - 1 + small;
        return answer;
    }
}
