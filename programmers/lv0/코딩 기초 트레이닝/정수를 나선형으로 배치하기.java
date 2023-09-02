class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        answer[0][0] = 1;
        int i = 0;
        int j = 0;
        int mode = 1;
        for (int num=2; num<=n*n; num++) {
            switch (mode % 4) {
                case 1:
                    j += 1;
                    if (j == n - 1 && answer[i][j] == 0) {
                        answer[i][j] = num;
                        mode += 1;
                    } else if (answer[i][j] != 0) {
                        j -= 1;
                        mode += 1;
                        num -= 1;
                    } else {
                        answer[i][j] = num;
                    }
                    break;
                case 2:
                    i += 1;
                    if (i == n - 1 && answer[i][j] == 0) {
                        answer[i][j] = num;
                        mode += 1;
                    } else if (answer[i][j] != 0) {
                        i -= 1;
                        mode += 1;
                        num -= 1;
                    } else {
                        answer[i][j] = num;
                    }
                    break;
                case 3:
                    j -= 1;
                    if (j == 0 && answer[i][j] == 0) {
                        answer[i][j] = num;
                        mode += 1;
                    } else if (answer[i][j] != 0) {
                        j += 1;
                        mode += 1;
                        num -= 1;
                    } else {
                        answer[i][j] = num;
                    }
                    break;
                case 0:
                    i -= 1;
                    if (answer[i][j] != 0) {
                        i += 1;
                        mode += 1;
                        num -= 1;
                    } else {
                        answer[i][j] = num;
                    }
                    break;
            } 
        }
        return answer;
    }
}
