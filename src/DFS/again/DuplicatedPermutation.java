package DFS.again;

import java.util.Scanner;

public class DuplicatedPermutation {
    static int n, m;
    static int[] arr;

    static void dfs(int l){
        if(l == m){
            for(int i : arr) System.out.print(i+" ");
            System.out.println();
        }else{
            for(int i = 1; i<=n; i++){
                arr[l] = i;
                dfs(l+1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        dfs(0);
    }
}
