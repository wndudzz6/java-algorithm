package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P4T {
    static int n;
    static class Lecture implements Comparable<Lecture>{
        int m;
        int d;
        Lecture(int m, int d){
            this.m = m;
            this.d = d;
        }
        public int compareTo(Lecture o) {
            return o.d-this.d;
        }
    }

    static int solution(ArrayList<Lecture> lec, int max){
        Collections.sort(lec);
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int j = 0;
        for(int i = max; i>=1 ; i--){
            for(; j<n;j++){ //j가 멈췄던 위치에서 시작함
                if(lec.get(j).d < i) break;
                pq.offer(lec.get(j).m);
            }
            if(!pq.isEmpty()) answer += pq.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        ArrayList<Lecture> lec = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            int d = sc.nextInt();
            lec.add(new Lecture(m, d));
            max = Math.max(max, d);
        }
        System.out.println(solution(lec, max));
    }
}
