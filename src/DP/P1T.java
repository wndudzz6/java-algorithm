package DP;

import java.util.Scanner;

//1. 계단오르기
//DP는 문제를 단계별로 쪼개서 최종 답을 구하는 방법이다.
public class P1T {
    static int solution(int n){
        int[] dy = new int[n+1];
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= n; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }

        return dy[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(solution(n));
    }
}
