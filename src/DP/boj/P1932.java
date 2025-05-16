package DP.boj;

import java.util.Scanner;

//정수 삼각형 문제. Top down(DFS+memoizaion) / Bottom-Up (이 코드)
//흐름이 눈에 보여서 쉽고 안전함
public class P1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 삼각형의 높이
        int[][] dp = new int[n][n];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = sc.nextInt();
            }
        }

        // Bottom-Up 방식으로 dp 갱신
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    // 삼각형의 가장 왼쪽 -> 위에서 한 방향만 가능
                    dp[i][j] += dp[i - 1][j];
                } else if (j == i) {
                    // 삼각형의 가장 오른쪽 -> 위의 대각선 한 방향만 가능
                    dp[i][j] += dp[i - 1][j - 1];
                } else {
                    // 중간 지점 -> 위에서 오는 두 방향 중 최대값 선택
                    dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                }
            }
        }

        // 마지막 줄 중에서 최댓값 선택
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[n - 1][i]);
        }

        System.out.println(max);
        sc.close();
    }
}
