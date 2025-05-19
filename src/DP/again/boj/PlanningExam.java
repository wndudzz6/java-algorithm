package DP.again.boj;

import java.util.Scanner;

/**
 * ✅ 문제: 시험 공부 계획 세우기 (가명)
 * 문제 설명
 * 넌 지금 시험 기간이고, N개의 과목을 공부해야 해.
 * 각 과목은 다음 정보를 가지고 있다:
 *
 * 공부 시간 T[i]
 *
 * 해당 과목의 중요도 S[i]
 *
 * 해당 과목을 공부해야만 시험에 응시할 수 있음
 *
 * 총 공부할 수 있는 시간은 M시간이다.
 *
 * 단,
 *
 * 한 과목을 공부하려면 이전에 끝낸 과목의 수가 K개 이상이어야 한다.
 * (즉, 처음에는 0개 과목만 선택 가능, 이후에는 조건을 만족한 만큼 선택 가능)
 *
 * 목표
 * 조건을 만족하는 한에서, M시간 이내에 가능한 공부 조합 중
 * 중요도의 총합을 최대로 하라.
 *
 * N = 5, M = 10, K = 2
 * T = [2, 3, 1, 5, 4]
 * S = [10, 30, 15, 60, 40]
 *
 * */

public class PlanningExam {

    static int solution(int n, int m, int k, int[] times, int[] impos){
        int answer = 0;
        int[][] dp = new int[m+1][m+1]; //i분일 때 과목 c개를 끝낸 중요도 총합
        for(int i = 0; i< n ; i++){
            int t = times[i];
            int p = impos[i];
            for(int j = m ; j >= t; j--){
                for(int c = i ; c >= 0 ; c--){
                    if (c >= k || c == 0) {
                        dp[j][c + 1] = Math.max(dp[j][c + 1], dp[j - t][c] + p);
                    }
                }
            }
        }
        for (int j = 0; j <= m; j++) {
            for (int c = 0; c <= n; c++) {
                answer = Math.max(answer, dp[j][c]);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] times = new int[n];
        int[] importance = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            importance[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, k, times, importance));
    }
}
