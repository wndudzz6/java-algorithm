package DP.again;

import java.util.Scanner;

public class P2 {

    static int solution(int n ){
        int[] dp = new int[n+2];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n+1 ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n+1];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(solution(n));
    }
}
