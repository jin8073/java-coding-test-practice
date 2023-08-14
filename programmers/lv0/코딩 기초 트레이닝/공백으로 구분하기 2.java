class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String[] answerArr = my_string.split(" ");
        String answerStr = "";
        for (int i=0; i<answerArr.length; i++) {
            if(answerArr[i].length() > 0) {
                answerStr += answerStr.length() == 0 ? answerArr[i] : "," + answerArr[i];
            }
        }
        answer = answerStr.split(",");
        return answer;
    }
}
