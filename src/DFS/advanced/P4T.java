package DFS.advanced;

import java.util.Scanner;

//중복 순열 구하기.
public class P4T {
    static int n; //구슬 개수
    static int m; //몇 번 뽑을지
    static int[] arr;

    static void dfs(int l){
        if(l==m){
            for(int x : arr) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i = 1; i<=n ; i++){
                arr[l] = i;
                dfs(l+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();
        arr = new int[m];
        dfs(0);
    }
}
