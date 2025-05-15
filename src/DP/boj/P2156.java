package DP.boj;

import java.util.Scanner;

public class P2156 {
    static int solution(int[] wines) {
        int n = wines.length;
        if (n == 0) return 0;
        if (n == 1) return wines[0];
        if (n == 2) return wines[0] + wines[1];

        int[] dp = new int[n];
        dp[0] = wines[0];
        dp[1] = wines[0] + wines[1];
        dp[2] = Math.max(Math.max(wines[0] + wines[2], wines[1] + wines[2]), dp[1]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(
                    dp[i - 1],
                    Math.max(
                            dp[i - 2] + wines[i],
                            dp[i - 3] + wines[i - 1] + wines[i]
                    )
            );
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wines = new int[n];
        for (int i = 0; i < n; i++) {
            wines[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(wines));
    }
}
