package searching;

import java.util.Arrays;
import java.util.Scanner;

//10. 마굿간 정하기 (결정 알고리즘) n새릐 마굿간에 c(m)마리의 말 배치
public class P10T {

    static int count(int[] arr, int dist){
        int cnt = 1; int ep = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]-ep >= dist){
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }
    static int solution(int n, int m, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while(lt<=rt){
            int mid = (rt+lt)/2;
            if(count(arr,mid) >= m){
                answer = mid;
                lt = mid+1;
            } else rt = mid-1;
        }return answer;
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
