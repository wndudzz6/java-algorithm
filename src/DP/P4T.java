package DP;

import java.util.*;

//4. 벽돌쌓기 문제 LIS 변형
public class P4T {

    static class Brick implements Comparable<Brick> {
        int s, h, w;

        Brick(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Brick o) {
            return o.s - this.s; // 넓이 큰 것 먼저
        }
    }

    static int solution(ArrayList<Brick> bricks) {
        Collections.sort(bricks);
        int n = bricks.size();
        int[] dy = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            dy[i] = bricks.get(i).h;
            for (int j = 0; j < i; j++) {
                if (bricks.get(j).w > bricks.get(i).w) { // 무게가 더 큰 애만 밑에 올 수 있음
                    dy[i] = Math.max(dy[i], dy[j] + bricks.get(i).h);
                }
            }
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Brick> bricks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            bricks.add(new Brick(s, h, w));
        }
        sc.close();
        System.out.println(solution(bricks));
    }
}
