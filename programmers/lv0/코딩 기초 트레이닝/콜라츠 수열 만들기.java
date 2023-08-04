class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        String answerStr = "";
        int x = n;
        while (x != 1) {
            if (answerStr.length() != 0) {
                answerStr += ",";
            }
            answerStr += x;
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
        }
        if (answerStr.length() != 0) {
                answerStr += ",";
        }
        answerStr += x;
        String[] strArr = answerStr.split(",");
        answer = new int[strArr.length];
        for (int i=0; i< strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}
