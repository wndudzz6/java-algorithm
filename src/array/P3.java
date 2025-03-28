package array;

import java.util.Scanner;

//3. 가위바위보
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] winner = new char[n];
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }sc.nextLine();
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(a[i] == b[i]) {
                winner[i] = 'D';
            } else if(a[i] == 1) {
                if(b[i] == 3) {
                    winner[i] = 'A';
                } else {
                    winner[i] = 'B';
                }
            }else if(a[i] == 2) {
                if(b[i] == 1) {
                    winner[i] = 'A';
                } else {
                    winner[i] = 'B';
                }
            }else if(a[i] == 3) {
                if(b[i] == 2) {
                    winner[i] = 'A';
                }else {
                    winner[i] = 'B';
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.println(winner[i]);
        }
    }
}
