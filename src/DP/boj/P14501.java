package DP.boj;

import java.util.*;

//1차원 DP, 점화식,
//시점에 따라 상태가 달라지는 문제 : 뒤에서부터 DP로 푼다.
public class P14501 {

    static class Day {
        int t, p;
        Day(int t, int p) {
            this.t = t;
            this.p = p;
        }
    }

    static int solution(int n, ArrayList<Day> days) {
        int[] dp = new int[n + 2]; // N+1일까지 고려 (0-based니까 크기 n+2)

        for (int i = n - 1; i >= 0; i--) {
            Day day = days.get(i);
            int next = i + day.t;

            if (next <= n) {
                dp[i] = Math.max(dp[i + 1], day.p + dp[next]);
            } else {
                dp[i] = dp[i + 1];
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Day> days = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            int p = sc.nextInt();
            days.add(new Day(d, p));
        }
        sc.close();

        System.out.println(solution(n, days));
    }
}
