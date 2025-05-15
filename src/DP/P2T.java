package DP;

import java.util.Scanner;

//2. 돌다리 건너기 ~ 계단이랑 뭐가 다르지? 개울은.. 한번 더 건너야 땅이다. 마지막 돌에서 한번 더!
public class P2T {

    static int solution(int n){
        int[] dp = new int[n+2];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n+1; i++){
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
