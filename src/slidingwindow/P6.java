package slidingwindow;

import java.util.Scanner;

//최대 길이 연속부분수열
public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(arr, n, k));
    }

    static int solution(int[] arr, int n, int k) {
        int answer = 0;
        int cnt = 0, lt = 0;
        for(int rt = 0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer =Math.max(answer, rt-lt+1);
        }

        return answer;
    }
}
