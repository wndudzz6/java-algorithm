package searching.deterministic.boj;

import java.util.Arrays;
import java.util.Scanner;

//백준 3079 입국심사 문제 줫나 긺. 도전
public class P3079 {

    static long count(int[] arr, long time){
        long cnt = 0;
        for(int i = 0; i < arr.length; i++){
            cnt += time/arr[i];
            if (cnt >= 1_000_000_000) break;
        }return cnt;
    }

    static long solution(int n, int m, int[] arr){
        long answer = 0;
        Arrays.sort(arr);
        long lt = 1;
        long rt = (long)arr[n-1] * m;

        while(lt <= rt){
            long mid =(lt+rt)/2;
            if(count(arr, mid) >= m) {
                answer = mid;
                rt = mid-1;
            }else lt = mid+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, arr));
    }
}
