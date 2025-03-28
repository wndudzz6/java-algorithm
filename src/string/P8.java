package string;

import java.util.Scanner;

//8. 팰린드롬
public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();


        for(String word : words) {
            for(int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if(Character.isLetter(ch)) {
                    sb.append(ch);
                }
            }
        }
        String ori = sb.toString();
        String rev = sb.reverse().toString();
        if(rev.equals(ori)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
