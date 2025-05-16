package DP.boj;

//백준2579 계단 오르기 연속된 세 계단을 밟을 수 없음.
//계단 밟을 떄마다 점수 획득, 얻을 수 있는 점수의 최댓값 구하기.

import java.util.Scanner;

public class P2579 {

    static int solution(int n, int[] stair){
        int[] dp = new int[n]; //i층에서 얻을 수 있는 점수의 최대합
        dp[0] = stair[0];
        dp[1] = stair[1]+stair[0];
        dp[2] = Math.max(stair[0] + stair[2], stair[1] + stair[2]);

        for(int i=3;i<n;i++){
            dp[i] = Math.max(
                    dp[i - 2] + stair[i],                        // 2칸 뛰어오기
                    dp[i - 3] + stair[i - 1] + stair[i]          // i-1, i 연속으로 밟기 (i-2는 건너뜀)
            );
        }

        return dp[n-1];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stair = new int[n];
        for(int i = 0; i < n; i++){
            stair[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(solution(n, stair));
    }
}
