package array;

import java.util.ArrayList;
import java.util.Scanner;

//리스트 이용 StringBuilder보다 훨씬 편하다.
public class P1Ref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        list.add(arr[0]);
        for(int i = 1; i < n; i++){
            if(arr[i]>arr[i-1]){
                list.add(arr[i]);
            }
        }
        for(int i : list){
            System.out.print(i+" ");
        }
    }
}
