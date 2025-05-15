package DP.boj;

import java.util.Scanner;

//1로 만들기 Top-Down 재귀+메모이제이션 유형
public class P1463 {

    static int solution(int n){
        int[] dp = new int[n+1];
        dp[1] = 0; //1은 이미 연산1이라 0번

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1]+1; //1을 뺀 경우
            if(i%2 == 0) dp[i] = Math.min(dp[i], dp[i/2]+1);
            if(i%3 == 0) dp[i] = Math.min(dp[i], dp[i/3]+1);
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
