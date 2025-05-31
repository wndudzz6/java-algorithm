package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//다익스트라
public class P5T {
    static int[] dis;
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;

    static class Edge implements Comparable<Edge>{
        int vex;
        int cost;
        public Edge(int v, int cost) {
            this.vex = v; //정점
            this.cost = cost; //가중치
        }
        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
    static void solution(int v){
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(v,0));
        dis[v] = 0;
        while(!pq.isEmpty()){
            Edge tmp = pq.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if(nowCost>dis[now]) continue;
            for(Edge o : graph.get(now)){
                if(dis[o.vex]>nowCost+o.cost) {
                    dis[o.vex] = nowCost+o.cost;
                    pq.offer(new Edge(o.vex, nowCost+o.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for(int i = 0; i<= n; i++){
            graph.add(new ArrayList<Edge>());
        }dis = new int[n+1];

        Arrays.fill(dis, Integer.MAX_VALUE);

        for(int i= 0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        solution(1);
        for(int i = 2; i<= n; i++){
            if(dis[i]!= Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+" : impossible");
        }

    }
}
