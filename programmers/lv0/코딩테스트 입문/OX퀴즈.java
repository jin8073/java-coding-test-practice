class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i=0; i<quiz.length; i++) {
            String[] numbers = quiz[i].split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[2]);
            int result = Integer.parseInt(numbers[4]);
            switch (numbers[1]) {
                case "+":
                    if (result == a + b) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                    break;
                case "-":
                    if (result == a - b) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                    break;
            }
        }
        return answer;
    }
}
