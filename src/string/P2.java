package string;

import java.util.Scanner;

//2. 대소문자 변환
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        System.out.println(change(sb));
    }

    public static String change(StringBuilder sb){
        for(int i = 0; i <sb.length(); i++){
            char ch = sb.charAt(i);
            if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            } else if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
            }
            sb.setCharAt(i, ch);
        }

        return sb.toString();
    }
}
