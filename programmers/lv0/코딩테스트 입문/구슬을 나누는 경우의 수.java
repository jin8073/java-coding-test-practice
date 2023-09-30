class Solution {
    public int solution(int balls, int share) {
        double number = 1.0;
        if (share > balls - share) {
            for (double i = share+1; i <= balls; i+=1.0) {
            number *= i;
            }
            for (double i = 1.0; i <= balls-share; i+=1.0) {
            number /= i;
            }
        } else {
            for (double i = balls-share+1; i <= balls; i+=1.0) {
            number *= i;
            }
            for (double i = 1.0; i <= share; i+=1.0) {
                number /= i;
            }
        }
        return (int) number;
    }
}
