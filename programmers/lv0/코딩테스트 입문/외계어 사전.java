class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (String word : dic) {
            if (word.length() == spell.length) {
                boolean flag = true;
                for (String alpa : spell) {
                    if (!word.contains(alpa)) {
                        flag = false;
                    }
                }
                if (flag) {
                    answer = 1;
                }
            }
        }
        return answer;
    }
}
