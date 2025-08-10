package DP.again;

import java.util.*;

//4. 가장 높은 탑 쌓기 ~ 정렬을 쓰긴 해야해서 클래스 만드는게 나을듯
//구성형!!! 누적형이 아님 누적형으로 dp구성했다가 틀림
//내가 억지로 정렬한 리스트일 뿐 사실 탑 쌓는데에 순서가 없다.
public class P4 {

    static class Brick implements Comparable<Brick>{
        int s;
        int h;
        int w;

        Brick(int s, int h, int w){
            this.s = s;
            this.h = h;
            this.w = w;
        }
        @Override
        public int compareTo(Brick o){
            return o.w-this.w; //무게 내림차순
        }
    }

    //LIS 사고 방식 : 지금 내가 고른게 제일 위, 끝
    static int solution(int n, ArrayList<Brick> bricks) {
        Collections.sort(bricks);
        int[] dp = new int[n]; //i를 맨 위로 둘 때 가장 큰 높이
        for(int i = 0; i<n; i++){
            dp[i] = bricks.get(i).h;
            for(int j = i; j>=0; j--){
                //j가 i보다 무게가 더 무겁다.
                if(bricks.get(i).s < bricks.get(j).s){
                    dp[i] = Math.max(dp[i], dp[j]+bricks.get(i).h);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
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
