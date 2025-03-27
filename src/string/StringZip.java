package string;

import java.util.Scanner;

public class StringZip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(i == s.length()-1){
                if(ch==s.charAt(i-1)){
                    sb.append(ch);
                    sb.append(count);
                }else {
                    sb.append(ch);
                }

            }else if(ch == s.charAt(i+1)){
                count++;
            }else if(ch != s.charAt(i+1)){
                if(count == 1){
                    sb.append(ch);
                }else{
                    sb.append(ch);
                    sb.append(count);
                }
                count = 1;
            }
        }
        System.out.println(sb.toString());
    }
}
