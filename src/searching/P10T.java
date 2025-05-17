package searching;

import java.util.Arrays;
import java.util.Scanner;

//10. 마굿간 정하기 (결정 알고리즘) n개의 마굿간에 c(m)마리의 말 배치
public class P10T {

    //판단함수 최대 몇 마리?
    static int count(int[] arr, int dist){
        int cnt = 1; //첫 말은 항상 제일 앞 마굿간에 둔다.
        int ep = arr[0]; //마지막으로 둔 마굿간 좌표

        for(int i = 1; i<arr.length; i++){
            if(arr[i] - ep >= dist){
                cnt++;  // 거리가 충분하니까 말 한 마리 더 배치
                ep = arr[i]; // 이 마굿간을 마지막 배치 지점으로 갱신
            }
        }
        return cnt;
    }

    static int solution(int n, int m, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1; //최소 거리
        int rt = arr[n-1] - arr[0];

        //원하는 것 : 거리가 D일 때, 말 m마리를 배치할 수 있는 최댓값 D
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid) >= m){ //m마리 이상 배치 가능하면 3마리도 배치 가능해서 이렇게 함.
                answer = mid; //항상 좋은 해만 answer에 남기 때문에 max() 안써도 된다.
                lt = mid + 1;
            }else rt = mid-1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }sc.close();
        System.out.println(solution(n, m, arr));
    }
}
