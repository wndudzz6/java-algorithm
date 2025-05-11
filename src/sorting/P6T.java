package sorting;

import java.util.Arrays;
import java.util.Scanner;

//6. 장난꾸러기
//ArrayList<>로 반환할 수도 있음. 난 그냥 void로 출력
public class P6T {
    static void solution(int n, int[] arr){
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        for(int i=0; i<n; i++){
            if(arr2[i] != arr[i]) System.out.print(i+1+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        solution(n, arr);
    }
}
