package DFS.again;

import java.util.Scanner;

//파스칼 삼각형
public class GuessSequence {
    static int[] ch, p;
    static int[][] dy = new int[35][35];
    static int n;
    static int f;
    static boolean flag = false;

    //nCr
    static int combi(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else{
            return dy[n][r] = combi(n-1, r-1)+combi(n-1, r);
        }
    }

    static void dfs(int l, int sum){
        if(flag) return; //flag필수. 안넣으면 for문이 여러번 돎
        if(sum > f) return;
        if( l == n && sum == f){
            flag = true;
            for(int x : p) System.out.print(x+" ");
        }else{
            for(int i = 1; i<=n ; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    p[l] = i;
                    dfs(l+1, sum + (p[l]*combi(n-1, l)));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        ch = new int[n+1];
        p = new int[n];
        sc.close();
        dfs(0, 0);
    }
}
