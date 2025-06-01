package Greedy.again;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//다익스트라 알고리즘
public class P5 {
    static int[] dis;
    static ArrayList<ArrayList<Edge>> graph;
    static class Edge implements Comparable<Edge>{
        int vex;
        int cost;
        Edge(int vex, int cost){
            this.vex = vex;
            this.cost = cost;
        }
        public int compareTo(Edge o){
            return this.cost - o.cost; //가중치 오름차
        }
    }

    static void solution(int v){
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(v,0));
        dis[v] = 0;

        while(!pq.isEmpty()){
            Edge tmp = pq.poll();
            int nowVex = tmp.vex;
            int nowCost = tmp.cost;
            if(dis[nowVex] < nowCost) continue;
            for(Edge o : graph.get(nowVex)){
                if(dis[o.vex] > nowCost+o.cost){
                    dis[o.vex] = nowCost+o.cost;
                    pq.offer(new Edge(o.vex, o.cost+nowCost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList<>();
        for(int i = 0; i<= n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b,c));
        }
        sc.close();
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        solution(1);

        for(int i = 2; i<=n ; i++){
            if(dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+" : impossible");
        }
    }
}
/*
입력
6 9
1 2 12
1 3 4
2 1 2
2 3 5
2 5 5
3 4 5
4 2 2
4 5 5
6 4 5
*/