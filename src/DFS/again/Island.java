package DFS.again;

import java.util.Scanner;

public class Island {
    static int[] dx = {-1, 0, 1, 0, 1, 1, -1, -1};
    static int[] dy = { 0, 1, 0,-1, -1, 1, -1, 1};
    static int[][] board;
    static int answer = 0;
    static int n;

    static void solution(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    answer++;
                    board[i][j] = 0;
                    dfs(i, j);
                }
            }
        }
    }
    static void dfs(int x, int y){
        for(int i = 0; i<8 ; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                board[nx][ny]=0;
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }sc.close();
        solution();
        System.out.println(answer);
    }
}
