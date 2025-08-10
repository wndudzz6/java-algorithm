package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//원더랜드(최소 스패닝 트리)
//트리는 그래프와 다르다. 회선이 없다!! 서로소인 경우에만 연결해야하니까 Union & Find 필요
public class P7T {
    static int[]unf;
    static int n,m, answer = 0;
    //Edge를 정점 두 개와 가중치로 보면 됨 이중 리스트일 필요 x
    static class Edge implements Comparable<Edge>{
        int v1;
        int v2;
        int cost;
        Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
        public int compareTo(Edge o) {
            return cost - o.cost; //현재 선택이 최우선이 되도록 정렬
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

    static void solution(ArrayList<Edge> edges){
        Collections.sort(edges);
        int cnt = 0; //간선의 개수가 많은 경우 다 정해졌을 때 미리 for문 종료 (선택)
        for(Edge o: edges){
            if(cnt == n-1) break; //간선이 n-1개가 되면 종료 (n은 정점 수)
            int fv1 = Find(o.v1);
            int fv2 = Find(o.v2);
            if(fv1!=fv2){
                answer+= o.cost;
                Union(o.v1, o.v2); //이제 합쳐준다.
                cnt++;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        unf = new int[n+1];
        ArrayList<Edge> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) unf[i] = i;

        for(int i = 0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Edge(a,b,c));
        }
        solution(arr);
        System.out.println(answer);
    }

}
