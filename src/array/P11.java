package array;

import java.util.Scanner;

//11. 임시반장 정하기 ~ 못 풀었음
public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][n];
        int[][] count = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] ==arr[j][j]){
                    count[i][j]++;
                }
            }
        }
        int max = 0;
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(count[i][j] > max){
                    max = count[i][j];

                }
            }
        }
        System.out.println(index);
    }
}
