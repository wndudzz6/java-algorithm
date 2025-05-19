package DP.again.boj;

import java.util.*;

public class P14501 {
    static int solution(int n, int[][] arr){
        int dp[] = new int[n+2];
        //dp는 현재 i일부터 퇴사 전까지 최대 수익

        for(int i = 1; i <= n; i++){
            int day = arr[i-1][0];
            int pay = arr[i-1][1];
            int next =i+day;

            if(next <= n){
                dp[i] = Math.max(dp[i+1], dp[next]+pay);
            }else{
                dp[i] = dp[i+1];
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, arr));
    }
}
