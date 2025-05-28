package DFS.advanced;

import java.util.Scanner;

//조합의 경우수 nCm 구하기
public class P7T {
    static int n, m;
    static int[][] dy = new int[35][35];

    static int dfs(int n, int r){
        if(dy[n][r] > 0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return  dy[n][r] = dfs(n-1, r-1)+dfs(n-1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(dfs(n,m));
    }
}
