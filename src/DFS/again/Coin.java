package DFS.again;

import java.util.Scanner;

public class Coin {
    static int n, m;
    static int[] coins;
    static int count = Integer.MAX_VALUE;

    static void dfs(int l, int sum) {
        if(sum>m) return;
        if(sum == m){
            count = Math.min(count, l);
        }else{
            for(int i=0; i<n; i++){
                dfs(l+1, sum+coins[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        coins = new int[n];
        for(int i = 0;i < n;i++){
            coins[i] = sc.nextInt();
        }
        m = sc.nextInt();
        sc.close();
        dfs(0, 0);
        System.out.println(count);
    }
}
