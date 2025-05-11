package recursive;

import java.util.Scanner;

//1. 재귀함수 자연수 N이 입력되면 재귀 함수를 이용하여 !~N출력하는 프로그램 작성하시오
public class P1T {
    static void solution(int n){
        if(n==0) return;
        solution(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        solution(n);
    }
}
