package slidingwindow;

import java.util.Scanner;

public class P3T {
    static int solution(int n, int k, int[] arr){
        int answer, sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr[i];
        } //초기값 설정 슬라이딩 윈도우
        answer = sum;
        for(int i = k ; i<n; i++){
            sum+=(arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n,k,arr));
    }

}
