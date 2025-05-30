package DP.again;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//4. 가장 높은 탑 쌓기 ~ 정렬을 쓰긴 해야해서 클래스 만드는게 나을듯
//구성형!!! 누적형이 아님 누적형으로 dp구성했다가 틀림
//내가 억지로 정렬한 리스트일 뿐 사실 탑 쌓는데에 순서가 없다.
public class P4 {

    static class Brick implements Comparable<Brick>{
        int s;
        int h;
        int w;

        Brick(int s, int h, int w) {
            this.s = s;//넓이
            this.h = h;//높이
            this.w = w;//무게
        }

        @Override
        public int compareTo(Brick o){
            return o.s - this.s; //넓이 기준정렬
        }
    }

    static int solution(int n, ArrayList<Brick> bricks) {
        Collections.sort(bricks);//넓이 기준 정렬
        int[] dp = new int[n];
        for(int i = 0; i < n; i++){
            dp[i] = bricks.get(i).h;
            for(int j = i-1; j>= 0;j-- ){
                if(bricks.get(j).w > bricks.get(i).w){
                    dp[i] = Math.max(dp[i], dp[j]+bricks.get(i).h);
                }
            }
        }return Arrays.stream(dp).max().getAsInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Brick> bricks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bricks.add(new Brick(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        sc.close();
        System.out.println(solution(n, bricks));
    }
}
