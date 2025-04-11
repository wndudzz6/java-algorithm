package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//3. 매출액의 종류 -- Time Limit Exceeded 뜸
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        solution(n, k, arr);
    }

    static void solution(int n, int k, int[] arr){
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0;
        for(int i = 0; i<n-k+1; i++){
            for(int rt = i; rt<i+k; rt++ ){
                map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            }answer.add(map.size());
            map.remove(arr[lt++]);
        }
        for(Integer kind : answer){
            System.out.print(kind+" ");
        }
    }
}
