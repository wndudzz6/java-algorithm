package DFS.again;

import java.util.Scanner;

public class Combination {
    static int n, m;
    static int[] combi;

    static void dfs(int l, int s){
        if(l==m){
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i = s; i<= n; i++){
                combi[l] = i;
                dfs(l+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        dfs(0,1);
    }
}
