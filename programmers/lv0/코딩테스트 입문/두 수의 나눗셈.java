/**
 * 두 수의 나눗셈
 * */
class Solution {
    public int solution(int num1, int num2) {
        boolean validation = (num1 > 0 && num1 <= 100) && (num2 > 0 && num2 <= 100);
        int answer = -1;
        if (validation) {
            answer = (num1 * 1000) / num2;
        }
        return answer;
    }
}
