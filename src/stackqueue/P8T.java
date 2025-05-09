package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//8. 응급
public class P8T {
    static class Patient{
        int id;
        int priority;

        Patient(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }

    static int solution(int n, int m, int[] arr){
        int answer = 0;
        Queue<Patient> Q = new LinkedList<>();
        for(int i=0;i<n;i++){
            Q.offer(new Patient(i, arr[i]));
        }
        while(!Q.isEmpty()){
            Patient tmp = Q.poll();
            for(Patient x : Q){
                if(x.priority > tmp.priority){
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }if(tmp != null){
                answer++;
                if(tmp.id == m) return answer;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n,m,arr));
    }
}
