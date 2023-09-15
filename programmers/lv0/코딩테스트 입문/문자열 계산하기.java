class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] formula = my_string.split(" ");
        for (int i=0; i<formula.length; i++) {
            if (i == 0) {
                answer = Integer.parseInt(formula[i]);
            } else if (formula[i].equals("+")) {
                answer += Integer.parseInt(formula[i+1]);
            } else if (formula[i].equals("-")) {
                answer -= Integer.parseInt(formula[i+1]);
            }
        }
        return answer;
    }
}
