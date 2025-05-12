package DFS.test;

//경로 탐색

import java.util.ArrayList;
import java.util.Scanner;

/**1번 노드에서 N번 노드까지 갈 수 있는 모든 경로의 개수를 출력하라
(노드는 양방향 연결, 사이클 없음)**/
/*
입력예시
5 9 --> 정점 5개, 간선 9개
1 2 --> 간선 정보 : 1번 노드에서 2번 노드로 연결됨
1 3 --> 1번 노드에서 3번 노드로 연결됨
1 4
2 1
2 3
3 4
4 5
3 5
2 5

그래프 모양
1 → 2 → 5
↓  ↘
3 → 4 → 5
 \____↑


출력예시
6
*/
public class GraphDFS {
    static int n, m, answer = 0;
    static ArrayList<Integer>[] graph; //정점마다 연결된 정점들을 담은 리스트배열
    static boolean[] visited;

    static void DFS(int v){
        if(v == n){
            answer++;
            return;
        }

        for(int nv : graph[v]){
            if(!visited[nv]){
                visited[nv] = true; //방문 체크
                DFS(nv); //깊이 탐색
                visited[nv] = false; //백트래킹을 위해 되돌리기
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        for(int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b); //방향 그래프 a->b
        }

        visited[1] = true; //1번부터 시작
        DFS(1);
        System.out.println(answer);
    }
}
