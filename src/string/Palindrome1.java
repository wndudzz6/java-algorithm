package string;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();

        if(rev.equals(str)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
