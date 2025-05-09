package sorting;

import java.util.Scanner;

//4. Least Recently Used
public class P4T {
    static int[] solution(int size, int n, int[] arr ){
        int[] cache = new int[size]; //최신 작업은 cache[0], 오래된 작업은 cache[size-1]
        for(int x : arr){
            int pos = -1;
            for(int i =0; i<size ; i++) if(x == cache[i]) pos = i;
            if(pos == -1 ){ //miss 상황
                for(int i = size-1; i>=1 ; i--){
                    cache[i] = cache[i-1];
                }
            }else{ //캐시에 이미 있는 작업
                for(int i = pos; i>=1 ; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return cache;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int x : solution(s, n, arr)) System.out.print(x+" ");
    }
}
