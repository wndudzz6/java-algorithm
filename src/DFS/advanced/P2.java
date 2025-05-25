package DFS.advanced;

import java.util.Scanner;
//바둑이 승차 문제 내가 짠 로직 DFS만 이용, 메모이제이션 적용X
public class P2 {
    static int sum = 0;
    static int c;
    static int n;
    static int max = Integer.MIN_VALUE;

    static void dfs(int l, int sum ,int[] w) {
        if(sum>c) return;
        if(l == n ){
            if(sum<=c) max = Math.max(max,sum);
        }else{
            dfs(l+1, sum+w[l], w);
            dfs(l+1, sum, w);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();

        int[] w = new int[n];
        for(int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
        dfs(0, 0, w);
        System.out.println(max);
    }
}
