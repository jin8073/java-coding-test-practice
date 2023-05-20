/** 짝수의 합
 * 매개변수로 정수 n이 주어짐(0 < n <= 1000)
 * n 이하의 짝수를 모두 더한 값을 return
 * */
class Solution {
    public int solution(int n) {
        int answer = 0;
        if (checkValidation(n)) {
            answer = getAnswer(n);
        }
        return answer;
    }

    private boolean checkValidation(int n) {
        if (n > 0 && n <= 1000) {
            return true;
        }
        return false;
    }

    private int getAnswer(int n) {
        int answer = 0;
        if (n > 1) {
            for (int i = 2; i <= n; i+=2) {
                answer += i;
            }
        }
        return answer;
    }
}
