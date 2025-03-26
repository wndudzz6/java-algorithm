package string;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        String[] words = new String[n];
        for(int i = 0 ; i < n ; i++){
            words[i] = sc.next();
        }

        for(int i = 0 ; i < words.length ; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}
