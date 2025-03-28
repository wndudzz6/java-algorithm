package string;

import java.util.Scanner;

//12. 암호
public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String password = sc.nextLine();
        String[] passwords = new String[n];
        char[] chars = new char[n];

        for(int i = 0; i < n; i++) {
            passwords[i]  = password.substring(0,7);
            password = password.substring(7);
        }
        //더 좋은 방법
        //passwords[i] = password.substring(0,7).replace('#',1).replace('*',0);
        //한 줄로 해결됨;

        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < passwords[i].length(); j++) {
                char ch = passwords[i].charAt(j);
                if(ch == '#'){
                    sb.append('1');
                } else{
                    sb.append('0');
                }
            }
            chars[i] = (char) Integer.parseInt(sb.toString(),2);
            //int num = Integer.parseInt(String, 2)
            //answer += (char)num //answer은 따로 초기화한 String 타입
        }


        for(int i = 0; i < n; i++) {
            System.out.print(chars[i]);
        }
    }
}
