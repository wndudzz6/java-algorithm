package DFS.test;

import java.util.Scanner;

public class Subset {
    static int[] ch;
    static int n;

    public static void DFS(int L) {
        if (L == n + 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) sb.append(i).append(" ");
            }
            if (sb.length() > 0) System.out.println(sb);
        } else {
            ch[L] = 1;         // L 포함
            DFS(L + 1);        // 다음 숫자 탐색
            ch[L] = 0;         // L 미포함
            DFS(L + 1);        // 다음 숫자 탐색
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n+1];
        sc.close();
        DFS(1);
    }
}
