/**
 * 중복된 숫자 개수
 * */
class Solution {
    public int solution(int[] array, int n) {
        if (!checkArrayLength(array) || !checkArrayN(n)) {
            throw new IllegalArgumentException("잘못된 입력 값입니다.");
        }
        int answer = countNumberOfN(array, n);
        return answer;
    }

    public boolean checkArrayLength(int[] array) {
        int length = array.length;
        if (length >= 1 && length <= 100) {
            return true;
        }
        return false;
    }

    public boolean checkArrayN(int n) {
        if (n >= 0 && n <= 1000) {
            return true;
        }
        return false;
    }

    public int countNumberOfN(int[] array, int n) {
        int count = 0;
        for (int number : array) {
            if (number == n) {
                count++;
            }
        }
        return count;
    }
}
