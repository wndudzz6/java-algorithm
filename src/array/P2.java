package array;

import java.util.Scanner;

//2. 보이는 학생
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
