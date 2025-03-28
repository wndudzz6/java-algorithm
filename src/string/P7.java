package string;

import java.util.Scanner;

//7. 회문문자열
public class P7 {
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
