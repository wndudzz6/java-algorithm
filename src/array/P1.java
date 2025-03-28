package array;

import java.util.Scanner;

//큰 수 출력하기
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(i == 0) {
                sb.append(arr[i]).append(" ");
            } else {
                if(arr[i] > arr[i-1]){
                    if(i==n-1){
                        sb.append(arr[i]);
                    } else{
                        sb.append(arr[i]).append(" ");
                    }
                }
            }
        }String s = sb.toString();
        System.out.println(s);
    }
}
