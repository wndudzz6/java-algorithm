package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//3. 결혼식 스위핑 알고리즘 - 인원 최대 겹침
public class P3T {
    static class Time implements Comparable<Time>{
        int time;
        char state;
        Time(int time, char state){
            this.time = time;
            this.state = state;
        }
        @Override
        public int compareTo(Time o) {//핵심
            if(this.time==o.time) return this.state-o.state; //e->s가 오름차순이니까 e상태인거부터 넣는다.
            else return this.time-o.time; //시간 기준 오름차순이 먼저
        }
    }

    static int solution(ArrayList<Time> times){
        Collections.sort(times);
        int cnt = 0;
        int answer = 0;

        for(Time t : times){
            if(t.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int sT = sc.nextInt();
            int eT = sc.nextInt();
            times.add(new Time(sT, 's'));
            times.add(new Time(eT, 'e'));
        }
        sc.close();
        System.out.println(solution(times));

    }

}
