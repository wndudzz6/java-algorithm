package string;

import java.util.Scanner;

public class P12Ref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String answer = "";

        for(int i = 0; i < n; i++){
            String tmp = s.substring(0,7).replace('#','1').replace('*','0');
            s= s.substring(7);
            int num = Integer.parseInt(tmp,2);
            answer += (char)num;
        }
        System.out.println(answer);
    }
}
