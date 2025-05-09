package sorting;

import java.util.Scanner;

//2. 버블정렬
public class P2T {
    static void solution(int n, int[] arr){
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){ //점점 비교 구간을 줄임(그냥 외부 For문과 범위가 같아도 사실 결과는 같다
                if(arr[j]>arr[j+1]){ //내림차순으로 바꾸고 싶으면 등호만 반대로 바꿔도 됨
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
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
        solution(n, arr);
    }
}
