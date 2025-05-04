package hashmap;

import java.util.*;

//매출액의 종류 슬라이딩 윈도우(투 포인터), 해시맵
public class P3T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        ArrayList<Integer> answer= solution(n,k,arr);
        for(Integer i:answer){
            System.out.print(i+" ");
        }
    }

    static ArrayList<Integer> solution(int n , int k , int[] arr){
        ArrayList<Integer> answer= new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i = 0; i<k-1; i++){ //초기화 0~k-2까지 카운트
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int lt = 0;
        for(int rt = k-1; rt<n; rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1); //당연히 key 값이 있음
            if(map.get(arr[lt])==0){
                map.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }
}
