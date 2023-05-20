/** 나이 출력
 * 나이 age가 주어짐(0 < age <= 120)
 * 2022년도 기준 출생 연도를 return
 * */
class Solution {
    public int solution(int age) {
        int answer = 0;
        if (checkValidation(age)) {
            answer = 2022 - age + 1;
        }
        return answer;
    }

    private boolean checkValidation(int age) {
        if (age > 0 && age <= 120) {
            return true;
        }
        return false;
    }
}
