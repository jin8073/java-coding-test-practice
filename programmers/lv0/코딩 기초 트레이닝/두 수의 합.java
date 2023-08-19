import java.lang.StringBuffer;

class Solution {
    public String solution(String a, String b) {
        StringBuffer sb = new StringBuffer(a);
        String reverseA = sb.reverse().toString();
        sb = new StringBuffer(b);
        String reverseB = sb.reverse().toString();
        String answer = "";
        int length = a.length() > b.length() ? a.length() : b.length();
        int temp = 0;
        for (int i=0; i<length; i++) {
            if (i >= a.length()) {
                String numB = reverseB.charAt(i) + "";
                int sum = Integer.parseInt(numB) + temp;
                if (sum > 9) {
                    temp = sum / 10;
                    sum = sum % 10;
                } else {
                    temp = 0;
                }
                answer = sum + answer;
            } else if (i >= b.length()) {
                String numA = reverseA.charAt(i) + "";
                int sum = Integer.parseInt(numA) + temp;
                if (sum > 9) {
                    temp = sum / 10;
                    sum = sum % 10;
                } else {
                    temp = 0;
                }
                answer = sum + answer;
            } else {
                String numA = reverseA.charAt(i) + "";
                String numB = reverseB.charAt(i) + "";
                int sum = Integer.parseInt(numA) + Integer.parseInt(numB) + temp;
                if (sum > 9) {
                    temp = sum / 10;
                    sum = sum % 10;
                } else {
                    temp = 0;
                }
                answer = sum + answer;
            }
        }
        if (temp != 0) {
            answer = temp + answer;
        }
        return answer;
    }
}
