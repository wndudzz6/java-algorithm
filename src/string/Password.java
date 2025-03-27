package string;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        int size = (password.length()+7-1)/7;
        String[] passwords = new String[size];
        for (int i = 0; i < password.length(); i++) {
            int start = i * size;
            int end = Math.min(start + size, password.length());
            passwords[i] = password.substring(start, end);
        }

        for(int i = 0; i < passwords.length; i++) {
            StringBuilder sb = new StringBuilder(passwords[i]);
            for(i = 0; i <sb.length();i++){
                char ch = sb.charAt(i);
                if(ch == '#'){
                    sb.setCharAt(ch,'1');
                } else {
                    sb.setCharAt(ch,'0');
                }
            }
            passwords[i] = sb.toString();
        }

        for(int i = 0; i < passwords.length; i++) {
            System.out.println(passwords[i]);
        }
    }
}
