package array;

import java.util.Scanner;

//9. 격자판 최대합 ~ 나름대로 열심히 풀긴 했지만 코드가 너무 긴 것이 아닌가?
public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][n];
        int[] max = {0,0,0};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //행의 합 구하기
        int sum = 0;
        int[] rowSum = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum += arr[i][j];
            }
            rowSum[i] = sum;
            sum = 0;
        }
        for(int i = 0; i < n; i++){
            if(rowSum[i] > max[0]){
                max[0] = rowSum[i];
            }
        }

        //열의 합 구하기
        sum = 0;
        int[] colSum = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum += arr[j][i];
            }colSum[i] = sum;
            sum = 0;
        }

        for(int i = 0; i < n; i++){
            if(colSum[i] > max[1]){
                max[1] = colSum[i];
            }
        }

        //대각선 합 구하기
        sum = 0;//왼쪽 대각선
        int[] diagSum = new int[2];
        for(int i = 0; i < n; i++){
           sum += arr[i][n-1-i];
        }diagSum[0] = sum;

        sum = 0;//오른쪽 대각선
        for(int i = 0; i < n; i++){
            sum+=arr[i][i];
        }diagSum[1] = sum;

        max[2] = (diagSum[0] > diagSum[1] ? diagSum[0] : diagSum[1]);

        int m = 0;
        for(int i = 0; i<2;i++){
            if(max[i] > m){
                m = max[i];
            }
        }
        System.out.println(m);
    }
}
