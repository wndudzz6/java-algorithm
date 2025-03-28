package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5. 소수(에라토스테네스 체) 소수인지 아닌지 구별하는 법에서 막힘
public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int[] ch = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {  // i가 소수인 경우
                count++;  // 소수 개수 증가
                for (int j = i; j <= n; j += i) {  // i의 배수들을 표시 (i만큼 증가이므로 i의 배수)
                    ch[j] = 1;  // 소수가 아님을 표시
                }
            }
        }
        System.out.println(count);
    }
}
