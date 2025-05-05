package stackqueue;

import java.util.Scanner;
import java.util.Stack;

//올바른 괄호
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        System.out.println(solution(s));
    }

    static String solution(String s) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            };
        }
        if(!stack.isEmpty()){
            return "NO";
        }

        return answer;
    }
}
