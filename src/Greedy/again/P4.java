package Greedy.again;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//4. 최대 수입 스케줄 (PQ응용문제)
public class P4 {
    static int n;
    static class Lecture implements Comparable<Lecture>{
        int money;
        int day;
        public Lecture(int money, int day) {
            this.money = money;
            this.day = day;
        }
        public int compareTo(Lecture o) {
            return o.day - this.day; //day 내림차순
        }
    }

    static int solution(ArrayList<Lecture> lec){
        Collections.sort(lec);
        int answer = 0;
        int max = lec.get(0).day;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int j = 0;
        for(int i= max ; i>= 1; i--){
            for(; j<n; j++){
                if(lec.get(j).day < i){
                    break;
                }else pq.offer(lec.get(j).money);
            }

            if(!pq.isEmpty()) answer+= pq.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> lectures = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int day = sc.nextInt();
            lectures.add(new Lecture(money, day));
        }
        sc.close();
        System.out.println(solution(lectures));
    }
}
