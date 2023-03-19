package programmers.lv0;

/** 배열의 평균값
 * 정수 배열 numbers가 매개변수로 주어짐
 * 0 <= numbers의 원소 <= 1000, 1 <= numbers의 길이 <= 100
 * numbers의 원소의 평균값을 return
 * 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어짐
 * */
public class Problem015 {
    public double solution(int[] numbers) {
        double answer = 0;
        if (checkValidation(numbers)) {
            for (int number : numbers) {
                answer += number;
            }
            answer /= numbers.length;
        }
        return answer;
    }

    private boolean checkValidation(int[] numbers) {
        if (numbers.length >= 1 && numbers.length <= 100) {
            for (int number : numbers) {
                if (number <0 || number > 1000) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
