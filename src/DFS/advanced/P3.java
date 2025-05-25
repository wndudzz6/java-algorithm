package DFS.advanced;

import java.util.Scanner;

public class P3 {
    static int n;
    static int m;
    static int max = Integer.MIN_VALUE+1;


    static void dfs(int l, int time, int sum, int[][] p){
        if(time>m) return;
        if(l == n){
            max = Math.max(max, sum);
        }else{
            dfs(l+1, time+p[l][1], sum+p[l][0], p);
            dfs(l+1, time, sum, p);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] p = new int[n][2];
        for(int i = 0;i<n;i++){
            p[i][0] = sc.nextInt();
            p[i][1] = sc.nextInt();
        }
        sc.close();
        dfs(0,0,0,p);
        System.out.println(max);
    }
}
