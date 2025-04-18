package slidingwindow;

import java.util.Scanner;

public class P4Ref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }

    static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0, sum = 0;
        for(int rt = 0; rt < n; rt++){
            sum += arr[rt];
            while(sum >= m) {
                if(sum == m) {
                    answer++;
                }
                sum -= arr[lt++];
            }
        }
        return answer;
    }
}
