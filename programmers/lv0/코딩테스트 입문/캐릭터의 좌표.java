class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0, 0};
        for (String input : keyinput) {
            switch (input) {
                case "up":
                    if (answer[1] < board[1] / 2) {
                        answer[1]++;
                    }
                    break;
                case "down":
                    if (answer[1] > (0 - board[1] / 2)) {
                        answer[1]--;
                    }
                    break;
                case "right":
                    if (answer[0] < board[0] / 2) {
                        answer[0]++;
                    }
                    break;
                case "left":
                    if (answer[0] > (0 - board[0] / 2)) {
                        answer[0]--;
                    }
                    break;
            }
        }
        return answer;
    }
}
