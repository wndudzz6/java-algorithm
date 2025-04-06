package slidingwindow;

import java.util.Scanner;

//5. 연속된 자연수의 합
public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(solution(n));

    }
    static int solution(int n){
        int answer = 0;
        int sum = 0, lt = 1;
        for(int rt = 1; rt < n/2+1; rt++){
            sum += rt;
            while(sum >= n) {
                if(sum == n) {
                    answer++;
                }
                sum -= lt++;
            }
        }

        return answer;
    }
}
