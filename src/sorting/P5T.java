package sorting;

import java.util.Arrays;
import java.util.Scanner;

//해시 맵으로 풀면 O(n)으로 간단하지만 정렬로도 풀 수 있다.
public class P5T {

    static char solution(int n, int[] arr) {
        char answer = 'U';
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) { //정렬하면 당연히 연속된 값으로 있을 것이므로
                return 'D';
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, arr));
    }
}
