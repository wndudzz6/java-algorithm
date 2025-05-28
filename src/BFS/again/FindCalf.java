package BFS.again;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCalf {
    static int[] jump = {1, -1, 5};
    static int[] ch = new int[10001];
    static Queue<Integer> Q = new LinkedList<>();

    static int bfs(int s, int e){
        int l = 0;
        ch[s] = 1;
        Q.offer(s);
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                int cur = Q.poll();
                if(cur == e) return l;
                for(int x : jump){
                    int nx = cur + x;
                    if(nx>0 && nx<=10000 && ch[nx]==0){
                        ch[nx]=1;
                        Q.offer(nx);
                    }
                }
            }l++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        sc.close();
        System.out.println(bfs(s,e));
    }
}
