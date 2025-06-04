package Greedy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

//최소 스패닝 트리 프림
public class P8T {
    static int n, m;
    static int[] ch;
    static class Edge implements Comparable<Edge>{
        int vex;
        int cost;
        Edge(int vex, int cost){
            this.vex = vex;
            this.cost = cost;
        }
        public int compareTo(Edge o){
            return this.cost - o.cost;
        }
    }
    static int solution(ArrayList<ArrayList<Edge>> graph){
        int answer = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(1,0));
        while(!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            int ev = tmp.vex;
            if(ch[ev] == 0){
                ch[ev] = 1;
                answer += tmp.cost;
                for(Edge edge : graph.get(ev)){
                    if(ch[edge.vex] == 0) pQ.offer(new Edge(edge.vex, edge.cost));
                }
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }

        System.out.println(solution(graph));
    }
}
