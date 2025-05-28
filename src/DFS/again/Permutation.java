package DFS.again;

import java.util.Scanner;

public class Permutation {
    static int n, m;
    static int[] arr, pm, ch;

    static void dfs(int l){
        if(l==m){
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i = 0; i < n; i++){
                if(ch[i] == 0){
                    ch[i] = 1; //선택
                    pm[l] = arr[i]; //진행
                    dfs(l+1); //재귀
                    ch[i] = 0; //선택해제(백트래킹)
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
        pm = new int[m];
        ch = new int[n];
        dfs(0);
    }
}
