package BFS.again;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {
    static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = { 0, 1, 0, -1};
    static int[][] board, dis;
    static int n, m;
    static Queue<Point> q = new LinkedList<>();

    static void bfs(){
        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i = 0; i< 4 ; i++){
                int x = tmp.x + dx[i];
                int y = tmp.y + dy[i];
                if(x>=0 &&x<n && y>=0 && y<m && board[x][y]==0){
                    board[x][y] = 1;
                    dis[x][y] = dis[tmp.x][tmp.y] + 1;
                    q.offer(new Point(x,y));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                board[i][j] = sc.nextInt();
                if(board[i][j]==1) q.offer(new Point(i, j));
            }
        }
        bfs();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(board[i][j]==0) flag = false;
            }
        }
        if(flag) {
            for(int i = 0; i<n; i++){
                for(int j = 0; j<m; j++){
                    answer = Math.max(answer,dis[i][j]);
                }
            }
            System.out.println(answer);
        }else System.out.println(-1);

    }
}
