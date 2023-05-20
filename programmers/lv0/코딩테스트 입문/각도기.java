/** 각도기
 * 각 angle이 매개변수로 주어짐(0 < angle <= 180, angle은 정수)
 * 예각(0 < angle < 90)일 때 1 return
 * 직각(angle == 0)일 때 2 return
 * 둔각(90 < angle < 180)일 때 3 return
 * 평각(angle == 180)일 때 4 return
 * */
class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (checkValidation(angle)) {
            answer = getAnswer(angle);
        }
        return answer;
    }

    private boolean checkValidation(int angle) {
        if (angle > 0 && angle <= 180) {
            return true;
        }
        return false;
    }

    private int getAnswer(int angle) {
        if (angle < 90) {
            return 1;
        }
        if (angle == 90) {
            return 2;
        }
        if (angle < 180) {
            return 3;
        }
        return 4;
    }
}
