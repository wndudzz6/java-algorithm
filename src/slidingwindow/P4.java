package slidingwindow;

import java.util.Scanner;

//4. 연속 부분 수열 - 이중 for문으로 구현 time exceeded
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int start = 0; start <n; start++) {
            int sum = 0;
            for(int end  = start; end < n; end++) {
                sum+=arr[end];
                if(sum==m) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
