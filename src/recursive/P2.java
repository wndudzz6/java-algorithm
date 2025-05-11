package recursive;

import java.util.Scanner;

//2. 내맘대로 이진수 출력 Integer.toBinaryString(n);
public class P2 {
    static String solution(int n){
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(solution(n));
    }
}
