package programmers.lv0;

/**
 * 배열 원소의 길이
 * */
public class Problem026 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
