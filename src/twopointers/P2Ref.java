package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//틀린게 없어보이는데 주어진 예시를 입력할 때 2 3 5 가 아닌 1 2 3 5 9가 출력된다.
public class P2Ref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        solution(arr, arr2);


    }

    private static void solution(int[] arr, int[] arr2) {
        int p1 = 0;
        int p2 = 0;
        List<Integer> answer = new ArrayList<>();
        while(p1<arr.length && p2<arr2.length){
            if(arr[p1]==arr[p2]) {
                answer.add(arr[p1]);
                p2++;
            } else if (arr[p1]<arr[p2]) p1++;
            else p2++;
        }

        for(int i = 0; i < answer.size(); i++){
            System.out.print(answer.get(i)+" ");
        }
    }


}
