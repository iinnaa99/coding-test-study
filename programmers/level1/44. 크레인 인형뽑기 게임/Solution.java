import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        
        for (int line : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][line-1] != 0) {
                    if (stack.size() > 0 && board[i][line-1] == stack.peek()) {
                        stack.pop();
                        count += 2;
                    } else {
                        stack.push(board[i][line-1]);
                    }
                    board[i][line-1] = 0;
                    break;    
                }
            }
        }
        return count;
    }
}