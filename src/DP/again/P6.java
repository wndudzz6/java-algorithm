package DP.again;

import java.util.Arrays;
import java.util.Scanner;

public class P6 {

    static int solution(int n, int m, int[][] arr){
        int[] dp = new int[m+1];
        for(int i = 0; i<n; i++){
            int ps = arr[i][0];
            int pt = arr[i][1];
            for(int j = m; j>= pt; j--){
                dp[j] = Math.max(dp[j], dp[j-pt]+ps);
            }
        }
        return dp[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, arr));
    }
}
