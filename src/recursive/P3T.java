package recursive;

import java.util.Scanner;

//3. 팩토리얼
public class P3T {

    static int DFS(int n){
        if(n == 1) return 1;
        else{
            return n * DFS(n-1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(DFS(n));
    }
}
