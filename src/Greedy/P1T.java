package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//1. 씨름선수 카와 몸무게 중 하나는 이겨야 한다.
public class P1T {
    static class Body implements Comparable<Body>{
        int h, w;

        Body(int h, int w){
            this.h = h;
            this.w = w;
        }
        @Override
        public int compareTo(Body o) {
            return o.h-this.h; //오름차순
        }
    }

    static int solution(ArrayList<Body> arr, int n){
        int answer = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for(Body bd : arr){
            if(bd.w > max){
                max = bd.w;
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h,w));
        }
        sc.close();
        System.out.println(solution(arr, n));
    }
}
