package DFS.boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//단지번호 붙이기
public class P2667 {
    static int[][] board;
    static int n;
    static ArrayList<Integer> list;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int dfs(int x, int y){
        board[x][y] = 0;
        int cnt = 1;
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                board[nx][ny]=0;
                cnt +=dfs(nx, ny);
            }
        }return cnt;
    }

    static void solution(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    int sum = dfs(i, j);
                    list.add(sum);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.next(); // 공백 없이 숫자 줄 입력
            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }
        sc.close();
        list = new ArrayList<>();
        solution();
        System.out.println(list.size());
        Collections.sort(list);
        for(int x : list) System.out.println(x);

    }
}
