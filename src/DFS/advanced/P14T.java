package DFS.advanced;

import java.util.ArrayList;
import java.util.Scanner;

//피자 배달거리 swea : dfs
public class P14T {
    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> hs,pz;

    static void dfs(int l, int s){
        if(l == m){
            int sum = 0;
            for(Point h : hs){//집 선택됨
                int dis = Integer.MAX_VALUE;
                for(int i : combi){ //살아남은 피잣집 다 비교
                    //Math.abs() 절댓값
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }//각 집마다 피자 배달 거리 구한거임
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }else{
            for(int i = s; i<len ; i++){
                combi[l] = i;
                dfs(l+1, i+1); //조합 코드 암기
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int tmp = sc.nextInt();
                if(tmp == 1) hs.add(new Point(i, j));
                else if(tmp == 2) pz.add(new Point(i, j));
            }
        }len = pz.size(); //len C m
        combi = new int[m];
        sc.close();
        dfs(0, 0);
        System.out.println(answer);

    }
}
