package BFS.again;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeShortest {
    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int[][] board = new int[8][8];
    static int[][] dis = new int[8][8];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    static void bfs(int x, int y){
        Queue<Point> q = new LinkedList<>();
        board[x][y] = 1;
        q.offer(new Point(x, y));

        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i = 0; i<4 ; i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if(nx>= 1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny] ==0){
                    board[nx][ny] = 1;
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=7; i++) {
            for(int j = 1; j <=7; j++){
                board[i][j] = sc.nextInt();
            }
        }sc.close();
        bfs(1,1);
        if(dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
