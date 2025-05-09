package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//6. 공주님 구하기
public class P6T {
    static int solution(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            q.add(i);
        }
        while(!q.isEmpty()) {
            for(int i = 1; i < k; i++) q.offer(q.poll());
            q.poll();
            if(q.size() == 1) answer=q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println(solution(n,k));
    }
}
