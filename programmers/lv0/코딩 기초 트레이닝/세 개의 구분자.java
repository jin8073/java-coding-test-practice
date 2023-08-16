class Solution {
    public String[] solution(String myStr) {
        String[] myStrArr = myStr.split("a|b|c");
        String[] answer = {};
        if (myStrArr.length == 0) {
            answer = new String[]{"EMPTY"};
        } else {
            int count = 0;
            for (int i=0; i<myStrArr.length; i++) {
                if (myStrArr[i].length() == 0) {
                    count++;
                }
            }
            answer = new String[myStrArr.length-count];
            int index = 0;
            for (int i=0; i<myStrArr.length; i++) {
                if (myStrArr[i].length() != 0) {
                    answer[index] = myStrArr[i];
                    index++;
                }
            }
        }
        return answer;
    }
}
