package DFS;

import java.util.Scanner;

// 경로 탐색(인접행렬)
public class P12T {
    static int[][] graph;
    static int[] ch;
    static int n;
    static int m;

    static int dfs(int v){
        int answer = 0;
        if(v==n) answer ++;
        else{
            for(int i = 1; i<= n; i++){
                if(graph[v][i] == 1 && ch[i] ==0) { //방문을 안했으면서 v가 갈 수 있는 곳
                    ch[i] = 1;
                    dfs(i); //다 돌고 리턴할 경우 이 밑부터 다시
                    ch[i] = 0; //check를 다시 풀어준다.
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i = 1; i <= m; i++){
            int a= sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        System.out.println(dfs(1));
    }
}
