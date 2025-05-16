package DP.again;

import java.util.Scanner;

//DP, 경우의 수 문제, Bottom-Up 방식
public class P1 {

    static int solution(int n){
        int[] dp = new int[n+1]; //i번째 층에서 경우의 수
        dp[0] = 1; //아무것도 안하는 1가지 방법
        dp[1] = 1;
        dp[2] = 2; //1, 2

        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(solution(n));
    }
}
