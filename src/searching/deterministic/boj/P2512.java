package searching.deterministic.boj;

import java.util.Arrays;
import java.util.Scanner;

public class P2512 {
    static int budget(int[] arr, int b){
        int sum =0;
        for(int x : arr){
            sum+= Math.min(x, b); //각 지방에 줄 수 있는 예산만큼 누적
        }
        return sum;
    }

    static int solution(int n, int m, int[] arr){
        int lt = 0;
        int rt = Arrays.stream(arr).max().getAsInt();
        int answer = lt;

        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(budget(arr, mid) <= m){
                answer = mid;
                lt = mid + 1;
            }else rt = mid - 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        sc.close();
        System.out.println(solution(n, m, arr));
    }
}
