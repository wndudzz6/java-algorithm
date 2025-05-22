package baehw.dp;

import java.util.Scanner;

public class P3_4 {

    static int maxSubArray(int n, int[] arr) {
        int currMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < n; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            globalMax = Math.max(globalMax, currMax);
        }

        return globalMax;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxSubArray(n,arr));
    }
}
