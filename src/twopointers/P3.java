package twopointers;

import java.util.Scanner;

//3. 최대 매출 ~ 내가 풀었음 Time Limit Exceeded 슬라이딩 윈도우를 쓰자
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sales = new int[n];
        int[] sum = new int[n-k];
        for(int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }
        sc.close();
        for(int i =0; i < n-k ; i++) {
            for(int j = 0; j < k; j++) {
                sum[i] += sales[j+i];
            }
        }

        int max = 0;
        for(int i =0; i < sum.length-1; i++) {
            if(sum[i]>max){
                max = sum[i];
            }
        }
        System.out.println(max);

    }
}
