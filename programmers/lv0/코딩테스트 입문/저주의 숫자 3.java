class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            answer++;
            boolean flag = true;
            while (flag) {
                if (answer % 3 == 0) {
                    answer++;
                } else if (checkContainThree(answer)) {
                    answer++;
                } else {
                    flag = false;
                }
            }
        }
        return answer;
    }
    
    private boolean checkContainThree(int number) {
        while (number > 0) {
            if (number % 10 == 3) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
