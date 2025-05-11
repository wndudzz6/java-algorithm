package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
문제 2: 회의실 예약 정렬
회의 시작 시간과 종료 시간이 주어질 때,
종료 시간이 빠른 순으로, 같다면 시작 시간이 빠른 순으로 정렬하라.
입력예시
4
1 4
2 3
3 5
0 6
출력예시
2 3
1 4
3 5
0 6
* */
public class SortingCustom2 {

    static class Meeting implements Comparable<Meeting> {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            if (this.end == o.end) return this.start - o.start; //오름차(종료부터)
            else return this.end - o.end; //오름차
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Meeting> meetings = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            meetings.add(new Meeting(start, end));
        }
        sc.close();
        Collections.sort(meetings);
        for(Meeting m : meetings) System.out.println(m.start+" "+m.end);
    }
}
