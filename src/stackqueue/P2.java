package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(solution(s));
    }

    static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c!=')') stack.push(c);
            else{
                while(!stack.isEmpty() && stack.peek() != '(') stack.pop();
                if(!stack.isEmpty())stack.pop();
            }
        }
        for(Character c : stack) sb.append(c);
        return sb.toString();
    }
}
