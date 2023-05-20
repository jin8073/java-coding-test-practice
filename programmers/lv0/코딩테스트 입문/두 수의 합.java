/**
 * 두 수의 합
 * */
class Solution {
    public int solution(int num1, int num2) {
        boolean validation = (num1 >= -50000 && num1 <= 50000) && (num2 >= -50000 && num2 <= 50000);
        int answer = -1;
        if (validation) {
            answer = num1 + num2;
        }
        return answer;
    }
}
