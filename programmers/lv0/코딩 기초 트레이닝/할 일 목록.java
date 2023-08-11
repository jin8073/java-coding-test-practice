class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int count = 0;
        for (boolean fin : finished) {
            if (!fin) {
                count++;
            }
        }
        answer = new String[count];
        int index = 0;
        for (int i=0; i<finished.length; i++) {
            if (!finished[i]) {
                answer[index] = todo_list[i];
                index++;
            }
        }
        return answer;
    }
}
