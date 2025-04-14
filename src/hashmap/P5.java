package hashmap;

import java.util.Scanner;

//5. k번쨰 큰 수
public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, k, arr));
    }

    static int solution(int n, int k, int[] arr) {
        int answer = 0;

        return answer;
    }
}
