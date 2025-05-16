package DP;

import java.util.Scanner;

//6. 최대점수 구하기 (냅색 알고리즘)
public class P6T {

    static int solution(int n, int m, int[][] problems){
        int[] dy = new int[m+1]; // 이 문제를 풀었을 때 최대 점수
        for(int i = 0; i<n ; i++){
            int ps = problems[i][0];
            int pt = problems[i][1];
            for(int j = m ; j>= pt; j--){
                dy[j] = Math.max(dy[j], dy[j-pt]+ps);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] problems = new int[n][2];
        for (int i = 0; i < n; i++) {
            problems[i][0] = sc.nextInt();
            problems[i][1] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, problems));
    }
}
