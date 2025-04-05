package array;

import java.util.ArrayList;
import java.util.Scanner;

//Int형으로 뒤집는거 이해를 못함. / 소수 조건 짜기 좀 어려움..
public class P6Ref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        sc.nextLine();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //뒤집기
        for(int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res))
                list.add(res);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;  // 1 이하의 수는 소수가 아님
        for (int i = 2; i * i <= num; i++) {
            if (num % i ==0) {
                return false;  // 나누어떨어지면 소수가 아님
            }
        }
        return true;  // 위의 조건을 모두 통과하면 소수
    }


}
