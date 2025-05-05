package stackqueue;

import java.util.Scanner;
import java.util.Stack;

//카카오 크레인 문제
public class P3 {
    static int solution(int n, int[][] board, int m, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < m; i++){
            int j = 0; //행 맨위
            while(board[j][moves[i]] == 0) j++;
            stack.push(board[j][moves[i]]);
        }

        //넣는거까진 됐는데 스택에서 연속된 같은 값이 있을 때 터뜨리는 데에 어려움을 겪음

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n+1]; //nxn 행렬인데 열 기준 0쓰기 싫음
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i < m; i++){
            moves[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n,board,m,moves));
    }
}
