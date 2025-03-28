package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//6. 뒤집은 소수 ~ 소수 구분부터 막힘.
//뒤집는 로직도 긴거같고 무엇보다 그냥 틀림..
public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int[] num = new int[n+1];
        List<Integer> demicals = new ArrayList<>();



        for(int i = 0; i < str.length; i++){
            StringBuilder sb = new StringBuilder(str[i]);
            sb.reverse();
            num[i] = Integer.parseInt(sb.toString());
        }

        for(int i = 2; i <= n; i++){
            for(int j = i; j <= n; j += i){
                if(num[i] == 0){
                    num[i] = 1;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if(num[i] != 0){
                if(num[i] != 1){
                    demicals.add(num[i]);
                }
            }
        }

        for (int i = 0; i < demicals.size(); i++) {
            System.out.print(demicals.get(i)+" ");
        }
    }
}
