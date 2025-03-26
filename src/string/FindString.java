package string;

import java.util.Scanner;

public class FindString {

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
