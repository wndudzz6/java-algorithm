package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 7. 교육과정 설계
public class P7T {
    static String solution(String need, String plan){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : need.toCharArray()) Q.offer(x); //큐에 필수과목 세팅
        for(char x : plan.toCharArray()) {
            if(Q.contains(x)){
                if(x!=Q.poll()) return "NO";
            }
        }if(!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        System.out.println(solution(a,b));
    }
}
