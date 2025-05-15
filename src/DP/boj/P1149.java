package DP.boj;

import java.util.Scanner;

//RGB 2차원 DP
public class P1149 {

    static int solution(int n, int[][] cost){
        int[][] dp = new int[n][3];
        dp[0][0] = cost[0][0]; //R
        dp[0][1] = cost[0][1]; //G
        dp[0][2] = cost[0][2]; //B

        for(int i = 1; i < n; i++){
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
        }

        int answer = Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[][] cost = new int[n][3];
        for (int i = 0; i < n; i++) {
            cost[i][0] = sc.nextInt();
            cost[i][1] = sc.nextInt();
            cost[i][2] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, cost));
    }
}
