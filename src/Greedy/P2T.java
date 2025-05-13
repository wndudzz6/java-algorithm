package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//2.회의실 배정
public class P2T {

    static class Time implements Comparable<Time>{
        int start;
        int end;
        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Time o) {
            if(this.end==o.end) return this.start-o.start;
            else return this.end - o.end;
        }
    }

    static int solution(ArrayList<Time> arr, int n ) {
        int answer = 0;
        Collections.sort(arr);
        int endTime = 0;
        for(Time ob : arr){
            if(ob.start>=endTime) {
                answer++;
                endTime = ob.end;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Time(sc.nextInt(), sc.nextInt()));
        }
        System.out.println(solution(arr, n));
    }
}
