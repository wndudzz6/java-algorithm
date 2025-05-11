package recursive;

import java.util.Scanner;
//재귀함수 스택프레임 생각하기
//2. 이진수로 만드는 법 : 일단 2의 나머지  // 재귀함수로 만들자.
public class P2T {

    static void DFS(int n){
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        DFS(n);
    }
}
