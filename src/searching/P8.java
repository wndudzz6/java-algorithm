package searching;
import java.util.Arrays;
import java.util.Scanner;

//8. 이분검색 ~ 내가 구현
public class P8 {
    static int solution(int n, int m, int[] arr){
        Arrays.sort(arr);
        int mid = arr[n/2];
        if(mid == m) return n/2+1;
        if(m>mid){
            for(int i=n/2;i<n;i++){
                if(arr[i]==m) return i+1;
            }
        }else{
            for(int i=n/2;i>=0;i--){
                if(arr[i]==m) return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, arr));
    }
}
