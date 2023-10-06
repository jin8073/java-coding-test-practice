import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Character> alpha = new ArrayList<>();
        ArrayList<Character> duplication = new ArrayList<>();
        for (int i=0; i<s.length(); i++) {
            if (alpha.contains(s.charAt(i))) {
                duplication.add(s.charAt(i));
            }
            alpha.add(s.charAt(i));
        }
        alpha.removeAll(duplication);
        Collections.sort(alpha);
        for (int i=0; i<alpha.size(); i++) {
            answer += alpha.get(i);
        }
        return answer;
    }
}
