package searching;

import java.util.Arrays;
import java.util.Scanner;
//8. 이분검색
public class P8T {
    static int solution(int n, int m, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0; int rt = n-1;
        while(lt <= rt){
            int mid = (rt + lt)/2;
            if(arr[mid] == m) {
                answer = mid;
                break;
            }
            if(arr[mid] > m) rt = mid-1;
            else lt = mid+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, arr));
    }
}
