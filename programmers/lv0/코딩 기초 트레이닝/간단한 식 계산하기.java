class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] formula = binomial.split(" ");
        int a = Integer.parseInt(formula[0]);
        int b = Integer.parseInt(formula[2]);
        switch (formula[1]) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;    
        }
        return answer;
    }
}
