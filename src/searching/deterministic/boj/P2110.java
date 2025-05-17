package searching.deterministic.boj;

import java.util.Arrays;
import java.util.Scanner;

//2110번 공유기 설치
//마굿간 문제와 동일함 그냥
public class P2110 {

    static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];
        for(int x : arr){
            if(x-ep >= dist){
                cnt++;
                ep = x;
            }
        }
        return cnt;
    }


    static int solution(int n, int m, int[] arr){
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1]-arr[0];
        int answer = 0;

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid) >= m){
                answer = mid;
                lt = mid+1;
            }else rt =mid-1;
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
        System.out.println(solution(n, m, arr));
    }
}
