package DFS.again;

import java.util.Scanner;

public class SubsetSum {
    static int n;
    static String answer = "NO";
    static boolean flag = false; //false초기화
    static int sum = 0; //현재 dfs에서 선택한 원소합
    static int total = 0; //부분집합 원소 전체 합

    //total - sum == sum이면 통과

    static void dfs(int l, int sum, int[] arr){
        if(flag) return;
        if(sum>total/2) return;
        if(l == n){
            if(total-sum == sum){
                answer = "YES";
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
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        sc.close();
        dfs(0, 0, arr);
        System.out.println(answer);
    }
}
