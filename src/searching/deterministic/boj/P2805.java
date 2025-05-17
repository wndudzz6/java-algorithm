package searching.deterministic.boj;

import java.util.Arrays;
import java.util.Scanner;

//나무자르기
public class P2805 {

    static long check(int[] arr, long h){
        long sum = 0;
        for(int x : arr){
            if(x>h){
                sum +=x-h;
            }
        }return sum;
    }

    static long solution(int n, int m, int[] arr){
        Arrays.sort(arr);
        long answer = 0;
        long lt = 1;
        long rt = arr[n-1]; //가장 큰 나무

        while(lt<= rt){
            long mid = (lt+rt)/2;
            if(check(arr, mid) >= m){
                answer = mid;
                lt = mid+1;
            }else rt = mid-1;
        }return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n,m,arr));
    }
}
