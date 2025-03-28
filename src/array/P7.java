package array;

import java.util.Scanner;

//7. 점수 계산 ~ 한번에 못 풀었음 도움받음
public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] ==1){
                count++;
                sum+=count;
            } else {
                count = 0;
            }
        }
        System.out.println(sum);
    }
}
