package baehw.dp;

import java.util.Scanner;

//최대 곱 부분 배열
public class P3_5 {

    static int maxProductSubarray(int n, int[] arr) {
        int maxProduct = arr[0];
        int currMax = arr[0];
        int currMin = arr[0]; // 음수 곱을 저장

        for (int i = 1; i < n; i++) {
            int temp = currMax;
            currMax = Math.max(arr[i], Math.max(currMax * arr[i], currMin * arr[i]));
            currMin = Math.min(arr[i], Math.min(temp * arr[i], currMin * arr[i]));
            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxProductSubarray(n, arr));
    }
}


