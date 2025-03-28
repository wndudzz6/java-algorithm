package string;

import java.util.Scanner;

//6. 중복 문자 제거
public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(arr[ch - 'a'] == 0) {
                sb.append(ch);
                arr[ch - 'a']++;
            }
        }
        System.out.println(sb.toString());
    }
}
