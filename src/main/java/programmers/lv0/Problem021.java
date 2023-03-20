package programmers.lv0;

/**
 * 중앙값 구하기
 * */
public class Problem021 {
    public int solution(int[] array) {
        int answer = 0;
        answer = sortArray(array)[array.length/2];
        return answer;
    }

    private int[] sortArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
