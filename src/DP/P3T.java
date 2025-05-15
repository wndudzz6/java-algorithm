package DP;

import java.util.Scanner;

//LIS
public class P3T {

    static int solution(int n, int[] arr){
        int answer = Integer.MIN_VALUE;
        int[] dy = new int[n];
        for(int i = 0; i < n; i++){
            dy[i] = 1; // 자신 하나로 이루어진 수열
            for(int j = i-1; j >= 0; j--){
                if(arr[j] < arr[i]){
                    dy[i] = Math.max(dy[i], dy[j] + 1);
                }
            }
            answer = Math.max(answer, dy[i]);
        }return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, arr));
    }

}
