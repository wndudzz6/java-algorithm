package sorting;

import java.util.Scanner;

//3. 삽입정렬
public class P3T {
    static void solution(int n, int[] arr){
        for (int i = 1; i<n; i++){
            int tmp = arr[i], j;
            for(j = i-1; j>=0; j--){
                if(arr[j]>tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        for(int x : arr) System.out.print(x+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        solution(n,arr);
    }
}
