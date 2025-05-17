package searching.deterministic.boj;

import java.util.Arrays;
import java.util.Scanner;

//p6236 용돈관리
public class P6236 {

    //인출횟수 반환
    static long check(int[] arr, long money){
        long cnt = 1;
        long sum = 0;
        for(int x : arr){
            if(sum + x > money){
                cnt++;
                sum = x;
            } else sum += x;
        }
        return cnt;
    }

    static long solution(int n, int m, int[] arr){
        long lt = Arrays.stream(arr).asLongStream().max().getAsLong();
        long rt = Arrays.stream(arr).asLongStream().sum();
        long answer = rt;

        while(lt<=rt){
            long mid = (lt+rt)/2;
            if(check(arr, mid) <= m){
                answer = mid;
                rt = mid-1;
            }else lt =mid+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, arr));
    }
}
