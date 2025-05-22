package baehw.dp;

import java.util.Scanner;

public class P3_2 {

    static int cheese(int n, int m, int[][] points) {
        int[][] dp = new int[n + 1][n + 1]; // 1-based index 사용
        boolean[][] cheese = new boolean[n + 1][n + 1];

        // 치즈 위치 마킹
        for (int i = 0; i < m; i++) {
            int x = points[i][0];
            int y = points[i][1];
            cheese[x][y] = true;
        }

        // DP 계산
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (cheese[i][j]) dp[i][j] += 1;
            }
        }
        return dp[n][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 테이블 크기
        int m = sc.nextInt(); // 치즈 수

        int[][] points = new int[m][2];
        for (int i = 0; i < m; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        System.out.println(cheese(n,m,points));
    }

}
