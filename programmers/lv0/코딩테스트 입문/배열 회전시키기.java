class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int save = 0;
        if (direction.equals("right")) {
            save = numbers[numbers.length-1];
            System.arraycopy(numbers, 0, answer, 1, numbers.length-1);
            answer[0] = save;
        } else {
            save = numbers[0];
            System.arraycopy(numbers, 1, answer, 0, numbers.length-1);
            answer[numbers.length-1] = save;
        }
        return answer;
    }
}
