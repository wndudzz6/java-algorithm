package slidingwindow;

import java.util.Scanner;

public class P3GPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sales = new int[n];

        for(int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }

        int maxSum = 0;
        int windowSum = 0;

        for(int i = 0; i < n; i++) {
            windowSum += sales[i];
        }
        maxSum = windowSum;

        for(int i = 0; i < n; i++) {
            windowSum += sales[i] - sales[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
    }
}
