package DFS.test;

import java.util.Scanner;

public class SubsetSum {
    static int n;
    static int m;
    static boolean[] ch;

    static void dfs(int l){
        int sum = 0;
        if(l == n+1){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<ch.length; i++){
                if(ch[i]) {
                    sum+=i;
                    sb.append(i);
                }

            }
            if(sum == m) {
                System.out.println(sb);
            }
        }else{
            ch[l] = true;
            dfs(l+1);
            ch[l] = false;
            dfs(l+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new boolean[n+1];
        sc.close();
        dfs(1);
    }
}
