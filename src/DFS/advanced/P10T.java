package DFS.advanced;

import java.util.Scanner;

//경로탐색 7*7 격자판 미로 0은 통로 1은 벽
//출발점 (1,1) 도착점 (7,7) 1based
public class P10T {
    static int[][] board = new int[8][8];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;

    static void dfs(int x, int y) {
        if(x==7 && y==7) answer++;
        else{
            for(int i = 0; i<4 ; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 1 && nx<=7 && ny >= 1 && ny<=7 && board[nx][ny]==0){
                    board[nx][ny] = 1;
                    dfs(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <=7; i++){
            for(int j = 1; j <=7; j++){
                board[i][j] = sc.nextInt();
            }
        }sc.close();
        board[1][1] = 1;
        dfs(1,1);
        System.out.println(answer);
    }

}
