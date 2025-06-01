package Greedy.again;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P7 {
    static int[] unf;
    static int n,m;

    static class Edge implements Comparable<Edge>{
        int v1;
        int v2;
        int cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        public int compareTo(Edge o) {
            return cost - o.cost; //오름차순. 그리디를 위해 필수
        }
    }

    static int Find(int v){
        if(unf[v] == v) return v;
        else return unf[v] = Find(unf[v]);
    }

    static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(fa!=fb) unf[fb] = fa;
    }

    static int solution(ArrayList<Edge> edges){
        Collections.sort(edges); //cost 최소
        int answer = 0;
        for(Edge e : edges){
            int v1 = Find(e.v1);
            int v2 = Find(e.v2);
            if(v1 != v2){
                answer += e.cost;
                Union(v1,v2);
            }
        }return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        unf = new int[n+1];
        for(int i = 1; i<= n; i++) unf[i] = i;
        ArrayList<Edge> edges = new ArrayList<>();

        for(int i = 0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            edges.add(new Edge(a,b,cost));
        }
        sc.close();
        System.out.println(solution(edges));
    }
}
