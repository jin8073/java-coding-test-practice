class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }
        for(int i=answer.length-1; i > 0; i--) {
            for (int j=0; j<i; j++) {
                String temp = "";
                int index = 0;
                int min_length = answer[j].length() > answer[j+1].length() ? answer[j+1].length() : answer[j].length();
                for (int k=0; k<min_length; k++) {
                    if (answer[j].charAt(index) == answer[j+1].charAt(index)) {
                        index++;
                    } else {
                        if (answer[j].charAt(index) > answer[j+1].charAt(index)) {
                            temp = answer[j];
                            answer[j] = answer[j+1];
                            answer[j+1] = temp;
                        }
                        break;
                    }
                }
                if (index == min_length) {
                    if (answer[j].length() > answer[j+1].length()) {
                        temp = answer[j];
                        answer[j] = answer[j+1];
                        answer[j+1] = temp;
                    }
                }
            }
        }
        return answer;
    }
}
