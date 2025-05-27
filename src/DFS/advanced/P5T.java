package DFS.advanced;

import java.util.Scanner;

//동전 교환 dfs 버전 ~ 중복 순열과 비슷함
//선택 구조가 아닌 이유 : 각 원소를 한 번만 쓸 수 있는게 아니라 무한정 쓸 수 있기 때문이다.
public class P5T {
    static int n, m;
    static int answer = Integer.MAX_VALUE;


    static void dfs(int l, int sum, int[] coins){
        if(sum>m) return;
        if(sum==m){
            answer = Math.min(answer,l);
        }else{
            for(int i=0;i<n;i++){ //동전의 종류 모두 사용
                dfs(l+1,sum+coins[i], coins); //l이 곧 동전의 개수
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] coins = new int[n];
        for(int i = 0; i < n; i++){
            coins[i] = sc.nextInt();
        }
        m = sc.nextInt();
        sc.close();
        dfs(0, 0, coins);
        System.out.println(answer);
    }
}
