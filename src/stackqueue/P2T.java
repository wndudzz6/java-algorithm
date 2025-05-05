package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class P2T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(solution(s));
    }

    static String solution(String s){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x==')'){
                while(stack.pop() != '(');
            }else stack.push(x);
        }
        for(int i = 0; i<stack.size(); i++) answer += stack.get(i);

        return answer;
    }
}
