package hashmap;

import java.util.*;

//3. 매출액 종류 문제에 Sliding Window 개념 적용
public class P3GPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        solution(n, k, arr);
    }

    static void solution(int n, int k, int[] arr) {
       Map<Integer, Integer> map = new HashMap<>();
       List<Integer> answer = new ArrayList<>();
       //초기 윈도우 설정
       for(int i = 0; i < k; i++) {
           map.put(arr[i], map.getOrDefault(arr[i],0)+1);
       }answer.add(map.size());

       for(int i = k; i < n; i++) {
           //왼쪽 값 제거
           int out = arr[i-k];
           map.put(out, map.get(out)-1);
           if(map.get(out) == 0) {
               map.remove(out);
           }
           //오른쪽 값 추가
           int in = arr[i];
           map.put(in, map.getOrDefault(in,0)+1);

           answer.add(map.size());
       }

       for(int x : answer){
           System.out.print(x+" ");
       }

    }
}
