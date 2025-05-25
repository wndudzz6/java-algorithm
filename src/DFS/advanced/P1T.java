package DFS.advanced;

import java.util.Scanner;
//total : 모든 원소의 합 sum : 현재 DFS에서 선택한 부분집합의 합
//그렇다면 남은 부분집합의 합은 total-sum
public class P1T {
    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;

    static void dfs(int l, int sum, int[] arr){
        if(flag) return;
        if(sum > total/2) return;
        if(l==n){
            if (total - sum == sum) {
                answer ="YES";
                flag = true;
            }
        }else{
            dfs(l+1, sum+arr[l], arr);
            dfs(l+1, sum, arr);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        sc.close();
        dfs(0, 0, arr);
        System.out.println(answer);
    }
}
