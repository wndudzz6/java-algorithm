package DFS.again;

import java.util.Scanner;

public class SubsetSum {
    static int n;
    static int[] arr;
    static boolean[] ch;
    static String answer = "NO";

    static void dfs(int l){
        int sum1 = 0, sum2 = 0;
        if(l==n){
            for(int i = 0; i < n; i++){
                if(ch[l]) sum1+=arr[i];
                else sum2+=arr[i];
            }
            if(sum1==sum2){
                answer = "YES";
            }
        }else{
            ch[l]=true;
            dfs(l+1);
            ch[l]=false;
            dfs(l+1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ch = new boolean[n+1];
        sc.close();
        dfs(0);
        System.out.println(answer);
    }
}
