package string;

import java.util.Scanner;

//1. 문자 찾기
public class P1 {

    public static void main(String[] args) {
        int solution = solution();
        System.out.println(solution);
    }
    public static int solution(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        char c = sc.next().charAt(0);
        char lowC = Character.toLowerCase(c);

        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == lowC){
                count++;
            }
        }
        return count;
    }
}
