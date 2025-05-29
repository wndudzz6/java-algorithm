package simul.boj;

import java.util.Scanner;

//로봇 청소기
public class P14503 {
    static int[][] board;
    static int n, m,answer = 0;
    static int[] dx = {0, -1, 0, 1 };
    static int[] dy = {1, 0, -1, 0};

    static void simulate(int x, int y, int d) {
        while (true) {
            // 1. 현재 칸 청소
            if (board[x][y] == 0) {
                board[x][y] = -1;  // 청소 완료 표시
                answer++;
            }

            boolean moved = false;
            for (int i = 0; i < 4; i++) {
                d = (d + 3) % 4;  // 반시계 방향 회전
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    // 청소 안 된 곳 발견 → 이동
                    x = nx;
                    y = ny;
                    moved = true;
                    break;
                }
            }

            if (!moved) {
                // 후진
                int back = (d + 2) % 4;
                int nx = x + dx[back];
                int ny = y + dy[back];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] != 1) {
                    x = nx;
                    y = ny;
                } else {
                    break;  // 후진도 못 하면 종료
                }
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        board = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        sc.close();
        simulate(r,c,d);
        System.out.println(answer);
    }

}
