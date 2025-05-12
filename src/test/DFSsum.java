package test;

import java.util.Scanner;

public class DFSsum {
    static int n;
    static int[] ch; // 체크 배열
    static int s;

    static void DFS(int L, int sum){
        if (L == n + 1) {
            if (sum == s) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= n; i++) {
                    if (ch[i] == 1) sb.append(i);
                }
                if (sb.length() > 0) System.out.println(sb.toString());
            }
        } else {
            ch[L] = 1; // L 포함
            DFS(L + 1, sum + L);

            ch[L] = 0; // L 미포함
            DFS(L + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        sc.close();
        ch = new int[n + 1];
        DFS(1, 0);
    }
}
