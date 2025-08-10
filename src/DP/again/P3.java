package DP.again;

import java.util.Arrays;
import java.util.Scanner;

//LIS
public class P3 {

    static int solution(int n, int[] arr){
        int[] dp = new int[n];
        Arrays.fill(dp, 1); //가장 짧은 경우는 자기 자신만 포함한 경우
        for(int i = 1; i<n; i++){
            for(int j = i; j>=0; j--){
                if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }
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
