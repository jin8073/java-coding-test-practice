class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] makeBoard = new int[board.length][board.length];
        for (int i=0; i<board.length; i++) {
             for (int j=0; j<board.length; j++) {
                 if (board[i][j] == 1) {
                     makeBoard = getBoard(i, j, makeBoard);
                 }
             }
        }
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (makeBoard[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
    
    private int[][] getBoard(int i, int j, int[][] board) {
        for (int m=i-1; m<=i+1; m++) {
            for (int n=j-1; n<=j+1; n++) {
                if (m >= 0 && n >= 0 && m < board.length && n < board.length) {
                    board[m][n] = 1;
                }
            }
        }
        return board;
    }
}
