package baehw.dp;

import java.util.Scanner;

//추가 문제 스티커 : 2차원 최대합
public class P3_6 {

    static int maxSticker(int n, int[][] stickers) {
        if (n == 1) return Math.max(stickers[0][0], stickers[1][0]);

        int[][] dp = new int[2][n];

        dp[0][0] = stickers[0][0];
        dp[1][0] = stickers[1][0];

        dp[0][1] = dp[1][0] + stickers[0][1];
        dp[1][1] = dp[0][0] + stickers[1][1];

        for (int i = 2; i < n; i++) {
            dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + stickers[0][i];
            dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + stickers[1][i];
        }

        return Math.max(dp[0][n-1], dp[1][n-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] stickers = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                stickers[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println(maxSticker(n, stickers));
    }
}
