package ssafy;

import java.util.Scanner;

//강변 빌딩 조망권
public class P1206D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //이 for문 형식을 잘 기억해둬야함 테스트 케이스를 한꺼번에 주기 때문에
        for(int i = 1 ; i <= 10 ; i++){
            int n = sc.nextInt();
            int[] buildings = new int[n];

            for(int j = 0; j<n; j++){
                buildings[j] = sc.nextInt();
            }
            int viewCount = 0;

            //맨 좌우 2칸은 건물이 없으므로 2~n-3칸 사이만 확인
            for(int k = 2; k< n-2; k++){
                int leftMax = Math.max(buildings[i-2], buildings[i-1]);
                int rightMax = Math.max(buildings[i+1], buildings[i+2]);
                int maxNeighbor = Math.max(leftMax, rightMax);


                if(buildings[k] > maxNeighbor){
                    viewCount = buildings[k]-maxNeighbor;
                }
            }

            System.out.println("#"+i+" "+viewCount);
        }
        sc.close();


    }
}
