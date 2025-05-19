package searching.deterministic;

import java.util.Arrays;
import java.util.Scanner;

public class P9 {

    static int count(int[] songs, int capacity){
        int sum = 0;
        int cnt = 1;
        for(int x: songs){
            if(sum+x > capacity){
                cnt++;
                sum = x;
            }else sum+=x;
        }
        return cnt;
    }

    static int solution(int n, int m, int[] songs){
        int lt = Arrays.stream(songs).max().getAsInt();
        int rt = Arrays.stream(songs).sum();
        int answer = rt;

        while(lt<= rt){
            int mid = (lt+rt)/2;

            if(count(songs, mid) <= m){
                answer = mid;
                rt = mid-1;
            }else lt = mid+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] songs = new int[n];
        for (int i = 0; i < n; i++) {
            songs[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, songs));
    }
}
