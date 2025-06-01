package Greedy.again;

import java.util.Scanner;

//서로소
public class P6 {
    static int[] unf;
    static int Find(int v){
        if(unf[v] == v) return v;
        else return unf[v] = Find(unf[v]);
    }

    static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(fa!=fb) unf[fb] = fa;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        unf = new int[n+1];
        for(int i = 1; i<=n ; i++) unf[i] = i;

        for(int i = 0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a,b);
        }

        int fa = Find(sc.nextInt());
        int fb = Find(sc.nextInt());
        sc.close();
        if(fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
