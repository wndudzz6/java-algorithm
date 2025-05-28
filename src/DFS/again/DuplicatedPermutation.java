package DFS.again;

import java.util.Scanner;

//백트래킹은 선택의 유무가 있을 때 명시하는거다.
//명시적인 백트래킹 코드는 아니나 알아서 잘함
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
