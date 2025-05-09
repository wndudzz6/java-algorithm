package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P8Again {
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
        Queue<Patient> q = new LinkedList<>();
        for(int i = 0; i<n; i++) q.offer(new Patient(i, arr[i]));
        while(!q.isEmpty()){
            Patient tmp = q.poll();
            for(Patient x : q){
                if(x.priority > tmp.priority){
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }if(tmp != null){
                answer ++;
                if(tmp.id == m) return answer;
            }
        }return 0;//도달x
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, arr));
    }

}
