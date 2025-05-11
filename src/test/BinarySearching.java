package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * "화물 운송 – 최소 배 용량 구하기"
 * N개의 화물이 있고, 각 화물의 무게는 arr[]에 저장되어 있다.
 * 이 화물들을 M일 안에 모든 항구로 옮겨야 한다.
 * 매일 배는 한 번만 출항하며, 배에는 순서대로 여러 개의 화물을 실을 수 있다.
 * 단, 한 배의 적재 용량은 일정하고, 화물은 순서를 바꾸거나 나눌 수 없다.
 *
 * 📌 목표: M일 안에 모든 화물을 운반할 수 있는 "최소한의 배 용량"을 구하라.
 *
 * Searching - P9T와 동일한 문제. 조영필 DVD
 */
public class BinarySearching {
    static int count(int[]arr, int capacity){ //하루당 최대 용량이 주어졌을 때 며칠 걸리는지
        int day = 1, sum = 0;
        for(int weight : arr){
            if(sum+weight > capacity){
                day++;
                sum = weight;
            }
            else sum+= weight;
        }
        return day;
    }

    static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid)<=m){
                answer = mid;
                rt = mid-1;
            }else lt = mid+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, arr));
    }
}
