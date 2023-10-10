class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] formal = polynomial.split(" ");
        int x = 0;
        int number = 0;
        for (String form : formal) {
            if (form.contains("x")) {
                if (form.length() == 1) {
                    x += 1;
                } else {
                    x += Integer.parseInt(form.substring(0, form.length()-1));
                }
            } else if (!form.equals("+")) {
                number += Integer.parseInt(form);
            }
        }
        if (x > 1) {
            answer += x + "x";
        } else {
            if (x == 1) {
                answer = "x";
            }
        }
        if (number != 0) {
            if (answer.length() > 0) {
                 answer += " + " + number;
            } else {
                answer += number;
            }
        }
        return answer;
    }
}
