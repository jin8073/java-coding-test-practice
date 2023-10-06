class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String numberStr = "";
        for (int i=0; i<numbers.length()-1; i+=3) {
            switch (numbers.substring(i, i+3)) {
                case "zer":
                    numberStr += "0";
                    i++;
                    break;
                case "one":
                    numberStr += "1";
                    break;
                case "two":
                    numberStr += "2";
                    break;
                case "thr":
                    numberStr += "3";
                    i+=2;
                    break;
                case "fou":
                    numberStr += "4";
                    i++;
                    break;
                case "fiv":
                    numberStr += "5";
                    i++;
                    break;
                case "six":
                    numberStr += "6";
                    break;
                case "sev":
                    numberStr += "7";
                    i+=2;
                    break;
                case "eig":
                    numberStr += "8";
                    i+=2;
                    break;
                case "nin":
                    numberStr += "9";
                    i++;
                    break; 
            }
        }
        answer = Long.parseLong(numberStr);
        return answer;
    }
}
