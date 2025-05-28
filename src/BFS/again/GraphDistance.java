package BFS.again;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//방향 그래프 최단 거리
//정점이 주어졌을 때 나머지 정점으로 가는 최소 거리 수를 구하시오 P10T
public class GraphDistance {
    static ArrayList<ArrayList<Integer>> graph;
    static int[] dis, ch;

    static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        q.offer(v);

        while(!q.isEmpty()){
            int cv = q.poll();
            for(int nv : graph.get(cv)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    q.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        sc.close();

        dis = new int[n+1];
        ch = new int[n+1];
        bfs(1);
        for(int i = 2; i<= n ; i++){
            System.out.println(i+" : "+dis[i]);
        }

    }
}
