package Greedy.again;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//씨름선수 문제
public class P1 {
    static class Wrestler implements Comparable<Wrestler>{
        int h;
        int w;
        public Wrestler(int h, int w){
            this.h = h;
            this.w = w;
        }
        @Override
        public int compareTo(Wrestler o) {
            return o.h-this.h;
        }
    }

    static int solution(ArrayList<Wrestler> w){
        int answer = w.size();
        int max = Integer.MIN_VALUE;
        for(Wrestler x : w){
            if(x.w > max){
                max = x.w;
            }else{
                answer--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Wrestler> w = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            w.add(new Wrestler(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(w);
        System.out.println(solution(w));
    }
}
