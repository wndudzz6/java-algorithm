package array;

import java.util.Scanner;

//10. 봉우리
public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n+2][n+2];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n+1; i++) {
            for(int j = 0; j < n; j++) {
                if(i==0 || j==0) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // 상, 하, 좌, 우 비교
                if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j]
                        && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
