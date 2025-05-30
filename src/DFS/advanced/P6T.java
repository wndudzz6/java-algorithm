package DFS.advanced;

import java.util.Scanner;

public class P6T {
    static int n, m;
    static int[] ch, arr, pm;
    //pm : permutation 순열 2
    static void dfs(int l){
        if(l==m){
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i =0; i<n; i++){
                if(ch[i] == 0 ){
                    ch[i] = 1;
                    pm[l] = arr[i];
                    dfs(l+1);
                    ch[i] = 0; //풀어준다.
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        ch = new int[n];
        pm = new int[m];
        dfs(0);
    }
}
