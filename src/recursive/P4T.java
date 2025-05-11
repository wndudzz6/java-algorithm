package recursive;

import java.util.Scanner;

//4. 피보나치수열
public class P4T {

    static int DFS(int n){
        if(n == 1) return 1;
        else if(n == 2) return 1;
        else{
            return DFS(n-1)+DFS(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n ; i++) System.out.print(DFS(i)+" ");
    }
}
