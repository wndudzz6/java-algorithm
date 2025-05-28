package DFS.advanced;

import java.util.Scanner;

//수열 추측하기
public class P8T {
    static int n, f;
    static int[] b,p,ch;
    static boolean flag = false;
    static int[][] dy = new int[35][35];

    //메모이제이션을 위함
    static int combi(int n, int r){
        if(dy[n][r] > 0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r]  =  combi(n-1, r-1)+combi(n-1, r);
    }

    static void dfs(int l, int sum){
        if(flag) return;
        if(l==n){
            if(sum == f) {
                for(int x : p) System.out.print(x+" ");
                flag = true;
            }
        }else {
            for(int i = 1; i<=n ; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    p[l] = i; //i 자체가 순열을 만드는 숫자?
                    dfs(l+1, sum+(p[l]*b[l]));
                    ch[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        sc.close();
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        for(int i = 0;i < n;i++){
            b[i] = combi(n-1, i);
        }
        dfs(0,0);
    }
}
