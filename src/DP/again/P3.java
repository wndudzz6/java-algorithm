package DP.again;

import java.util.Arrays;
import java.util.Scanner;

//LIS
public class P3 {

    static int solution(int n, int[] arr){
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(arr[i]> arr[j]){
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }dp[i]++;
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, arr));
    }
}
