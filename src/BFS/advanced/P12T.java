package BFS.advanced;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//토마토
public class P12T {
    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int n,m;
    static int[][] board, dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point> q = new LinkedList<>();


    static void bfs(){
        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i = 0; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>= 0 && nx<n && ny>= 0 && ny<m && board[nx][ny]==0){ //-1, 1일 때는 접근x
                    board[nx][ny] = 1;
                    q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;

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
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1) {
                    q.offer(new Point(i,j));
                }
            }
        }
        sc.close();
        bfs();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++){
            for(int j = 0;j <m;j++){
                if(board[i][j] == 0) flag = false;
            }
        }
        if(flag){
            for(int i = 0; i<n; i++){
                for (int j = 0; j < m; j++){
                    answer = Math.max(answer,dis[i][j]);
                }
            }
            System.out.println(answer);
        }else System.out.println(-1);


    }
}
