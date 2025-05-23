package DFS;

import java.util.ArrayList;
import java.util.Scanner;

//경로 탐색 (인접리스트) ~ 정점이 개많을 때 리스트로 하는게 낫다.
public class P13T {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    static int dfs(int v){
        if(v==n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv] == 0){
                    ch[nv] =1;
                    dfs(nv);
                    ch[nv] = 0;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<= n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i = 0; i <= m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        System.out.println(dfs(1));

    }
}
