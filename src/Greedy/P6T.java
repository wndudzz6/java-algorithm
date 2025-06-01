package Greedy;

import java.util.Scanner;

//6. 친구인가
public class P6T {
    static int[] unf; //i번 사람의 대표자를 의미

    //Union & Find 암기하자!!
    static int Find(int v){
        if(v==unf[v]) return v;
        else return unf[v]=Find(unf[v]); //대표자를 재귀적으로 찾아가며 경로 압축 수행
    }

    static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb) unf[fb]=fa;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n+1];
        //친구관계 생기기 전까진 본인이 본인 그룹의 대표자인거임 현재 서로소 상태
        for(int i = 1; i<=n; i++) unf[i] = i;

        for(int i = 1; i<= m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a,b);
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int fa = Find(a);
        int fb = Find(b);
        if(fa == fb) System.out.println("YES");
        else System.out.println("NO");

        }
}
