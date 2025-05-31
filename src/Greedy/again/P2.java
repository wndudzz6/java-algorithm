package Greedy.again;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//회의실 배정
public class P2 {
    static class Meeting implements Comparable<Meeting>{
        int start;
        int end;
        public Meeting(int start, int end){
            this.start = start;
            this.end = end;
        }
        public int compareTo(Meeting o) {
            if(this.end==o.end){
                return this.start-o.start;
            }else return this.end-o.end; //끝 기준으로 오름차순
        }
    }

    static int solution(ArrayList<Meeting> meetings){
        Collections.sort(meetings);
        int answer = 0;
        int endTime = 0;
        for(Meeting x : meetings){
            if(endTime<= x.start){
                answer++;
                endTime=x.end;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            meetings.add(new Meeting(start, end));
        }
        System.out.println(solution(meetings));
    }
}
