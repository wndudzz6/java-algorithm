package DP.boj;

import java.util.ArrayList;
import java.util.Scanner;


//동전1, 조합형 DP
public class P2293 {
    static class Coin {
        int p;

        Coin(int p) {
            this.p = p;
        }
    }

    static int solution(ArrayList<Coin> coins, int k) {
        int[] dp = new int[k + 1];
        dp[0] = 1; // 초기화: 0원을 만드는 경우 1가지 *필수*

        for (Coin c : coins) {
            for (int i = c.p; i <= k; i++) {
                dp[i] += dp[i - c.p];
            }
        }

        return dp[k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Coin> coins = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            coins.add(new Coin(sc.nextInt()));
        }
        sc.close();
        System.out.println(solution(coins, k));
    }
}
