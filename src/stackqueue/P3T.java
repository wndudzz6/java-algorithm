package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class P3T {
    static int solution(int[][] board, int[]moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            for(int i = 0; i<board.length; i++){
                if(board[i][pos-1] !=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer+=2;
                        stack.pop();
                    }else stack.push(tmp);
                    break; //0이 아닐 때 인형 꺼내고 여기서 moves의 다음 인덱스로 가야함!!
                }
            }
        }
        return answer;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i < m; i++){
            moves[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(board, moves));
    }
}
