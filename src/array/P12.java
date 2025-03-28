package array;

import java.util.Scanner;

//12. 멘토링 ~ 진짜 모르겠다.
public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //반 학생 수
        int m = sc.nextInt(); //수학성적 M번
        sc.nextLine();
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
