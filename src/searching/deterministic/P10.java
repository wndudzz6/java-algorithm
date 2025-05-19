package searching.deterministic;

import java.util.Arrays;
import java.util.Scanner;

//10. 마구간 정하기
public class P10 {
    //판단함수 ~ 말을 최대 몇 마리 배치할 수 있나?
    static int count(int[] arr, int dist){
        int cnt = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-ep >= dist){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    static int solution(int n, int m, int[] arr){
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1] - arr[0];
        int answer = lt;

        while(lt <= rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid) >= m){
                answer = mid;
                lt = mid + 1;
            }else rt = mid-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }sc.close();
        System.out.println(solution(n, m, arr));
    }
}
