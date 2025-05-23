package DFS.advanced;

import java.util.Scanner;

public class P1GPT {
    static int n;
    static int[] arr;
    static boolean[] ch;
    static String answer = "NO";
    static boolean found = false;

    static void dfs(int L) {
        if (found) return;  // 이미 정답 찾았으면 더 이상 탐색 안 함

        if (L == n) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                if (ch[i]) sum1 += arr[i];
                else sum2 += arr[i];
                //서로소 조건에서 어느 쪽에도 포함되지않는 경우는 없다.
                //서로소 두 집합으로 나눈다는 것은 전체 집합을 빠짐없이 분할하는 것을 의미
            }
            if (sum1 == sum2) {
                answer = "YES";
                found = true;
            }
        } else {
            ch[L] = true;
            dfs(L + 1);

            ch[L] = false;
            dfs(L + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        ch = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        dfs(0);
        System.out.println(answer);
    }
}
