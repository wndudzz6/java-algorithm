package simul.boj;

import java.util.Scanner;

//창고다각형
public class P2304 {
    static int left = Integer.MAX_VALUE;
    static int right = Integer.MIN_VALUE;
    static int maxH = 0, maxIdx = 0;
    static int[] height;

    static int solution(){
        int area = 0;

        // 왼쪽부터 최고 기둥까지
        int curH = 0;
        for (int i = left; i < maxIdx; i++) {
            curH = Math.max(curH, height[i]);
            area += curH;
        }

        // 오른쪽부터 최고 기둥까지
        curH = 0;
        for (int i = right; i > maxIdx; i--) {
            curH = Math.max(curH, height[i]);
            area += curH;
        }

        // 최고 기둥 면적 더하기
        area += maxH;

        return area;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        height = new int[1001]; //x좌표가 1~1000

        for(int i = 0; i<n; i++){
            int x =sc.nextInt();
            int h = sc.nextInt();
            height[x] = h;
            if(h>maxH){
                maxH = h;
                maxIdx = x;
            }
            left = Math.min(left,x);
            right = Math.max(right,x);
        }
        System.out.println(solution());
    }
}
