package Greedy.again;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P3 {
    static class Time implements Comparable<Time>{
        int time;
        char state;
        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }
        public int compareTo(Time o){
            if(this.time == o.time) return this.state - o.state;//e->s
            else return this.time - o.time; //time 오름차순
        }
    }
    static int solution(ArrayList<Time> times){
        Collections.sort(times);
        int cnt = 0;
        int answer = 0;
        for(Time t : times){
            if(t.state == 's'){
                cnt++;
                answer = Math.max(answer, cnt);
            }else cnt--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        for(int i = 0; i< n; i++){
            int ts = sc.nextInt();
            int te = sc.nextInt();
            times.add(new Time(ts, 's'));
            times.add(new Time(te, 'e'));
        }
        sc.close();
        System.out.println(solution(times));
    }
}
