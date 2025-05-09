package stackqueue;

import java.util.Scanner;
import java.util.Stack;

//5. 쇠막대기 ~ 좀 어렵다. 완벽하게 납득 못함.
public class P5T {
    static int solution(String s){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack.push('(');
            else{
                stack.pop();
                if(s.charAt(i-1)=='(') answer+=stack.size();
                else answer+=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(solution(s));
    }
}
