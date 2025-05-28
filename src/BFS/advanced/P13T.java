package BFS.advanced;
import java.util.*;

//섬나라 아일랜드
public class P13T {
    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int n, answer = 0;
    static int[] dx = {-1, 0, 1, 0, 1, 1, -1, -1};
    static int[] dy = {0, 1, 0, -1, -1, 1, -1, 1};
    static int[][] board;
    static Queue<Point> queue = new LinkedList<>();

    static void solution(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    answer++;
                    board[i][j] = 0;
                    bfs(i, j);
                }
            }
        }
    }

    static void bfs(int x, int y){
        queue.offer(new Point(x,y));
        while(!queue.isEmpty()){
            Point tmp = queue.poll();
            for(int i = 0; i < 8; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                    board[nx][ny] = 0;
                    queue.offer(new Point(nx,ny));
                }
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
        }
        sc.close();
        solution();
        System.out.println(answer);
    }


}
