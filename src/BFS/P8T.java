package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//8. 송아지 찾기
public class P8T {
    static int[] dis = {1, -1, 5};
    static int[] ch;
    static Queue <Integer> Q = new LinkedList<>();

    static int BFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int l = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i = 0; i < len; i++) {
                int x = Q.poll();
                if(x == e) return l;
                for(int j = 0; j<3; j++){
                    int nx = x+dis[j];
                    if(nx>=1 && nx<=10000 && ch[nx]==0){
                        ch[nx]=1;
                        Q.offer(nx);
                    }
                }
            }
            l++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(BFS(s,e));
    }
}
