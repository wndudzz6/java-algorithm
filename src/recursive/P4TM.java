package recursive;

//메모이제이션 피보나치 DP
public class P4TM {
    static int[] fibo; // 이 부분이 제일 중요함.
    static int DFS(int n) {
        if(fibo[n]> 0) return fibo[n];
        if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-1)+DFS(n-2);
    }

    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n+1];
        DFS(n);
        for(int i=1;i<=n;i++) System.out.print(fibo[i]+" ");
    }
}
