package hashmap;

import java.util.*;

//5. k번쨰 큰 수 ~ hashMap이 아닌 treeSet 사용 중복 제거, 오름차순 정렬
public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, k, arr));
    }

    //카드 중 세 장을 뽑아서 합을 구한다. 이 합 중에서 k번째로 큰 수를 구함
    static int solution(int n, int k, int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); // 중복 제거 + 내림차순 정렬
        for (int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int l = j+1; l<n; l++){
                    int sum =arr[i]+arr[j]+arr[l];
                    set.add(sum);
                }
            }
        }
        int count = 0;
        for(int answer: set){
            count ++;
            if(count == k) return answer;
        }
        return -1;
    }
}
