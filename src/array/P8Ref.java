package array;

import java.util.Scanner;

public class P8Ref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] rank = new int[n];
        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                }
            }rank[i] = count;
        }
        for(int i = 0; i < n; i++){
            System.out.print(rank[i] + " ");
        }
    }
}
