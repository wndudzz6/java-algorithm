package simul.boj.again;

import java.util.Scanner;
/**“시뮬레이션 문제의 핵심은 단위 시간 동안 일어나는 행동을 코드로 모사하는 것”
 그리고 그 구조는 대부분 while + if + for + 종료 조건 형태로 표현돼.
 한 번의 while 루프는 한 단위 시간(또는 턴)의 시뮬레이션을 처리한다*/

public class P14503 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int n, m, answer = 0;

    //while을 쓸 때엔 이거 끝날 때마다 정확히 뭘 하고 싶은지 알아야 한다.
    static void simulate(int x, int y, int d){
        while(true){ //딱 한 칸을 청소할거임
            if(board[x][y] == 0){
                board[x][y] = -1;
                answer++;
            }

            boolean flag = false;
            for(int i = 0; i < 4; i++){
                d = (d+3)%4; //반시계 방향
                int nx = x+dx[d];
                int ny = y+dy[d];
                if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny] == 0){
                    x = nx;
                    y = ny;
                    flag = true;
                    break; //닦을 곳 찾았으니 멈춤
                }
            }
            //현재 칸의 주변 4칸 중 청소되지 않은 빈칸이 없는 경우 후진
            //!!중요!! 후진만 해야함 while 문 한번당 한번만 닦는거니까
            if(!flag){
                int back = (d+2)%4;
                int nx = x+dx[back];
                int ny = y+dy[back];
                if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny] != 1) {
                    x = nx;
                    y = ny;//다음 while에서 닦을 게 있으면 그때 닦으면 돼
                }else break; //종료
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
        simulate(r, c, d);
        System.out.println(answer);

    }
}
