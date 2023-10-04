class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] numbers = s.split(" ");
        for (int i=numbers.length-1; i>=0; i--) {
            if (numbers[i].equals("Z")) {
                i--;
            } else {
                answer += Integer.parseInt(numbers[i]);
            }
        }
        return answer;
    }
}
