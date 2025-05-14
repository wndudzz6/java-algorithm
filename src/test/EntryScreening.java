package test;

//결정 알고리즘 연습 문제 Searching P8참고

import java.util.Arrays;
import java.util.Scanner;

/***
 * 문제 설명 (간단 요약)
 * N명의 사람이 입국 심사를 받아야 해요.
 *
 * 각 심사관은 심사에 걸리는 시간이 다르고, times[] 배열로 주어져요.
 *
 * 모든 사람을 심사하는 최소 시간을 구하세요.
 */

/*
예시입력
N = 6
times = {7, 10}
*/

/***
 * 핵심 : 시간을 던지고 → 사람 수로 판단해서 → 그 시간이 조건을 만족하는지 확인하는 것,
 */
public class EntryScreening {

    static int count(int[] times, int t) {
        int total = 0;
        for (int time : times) {
            total += t / time;  // 각 심사관이 t 시간 동안 처리할 수 있는 사람 수
        }
        return total;
    }

    static int solution(int n, int[] times){
        int lt = 1;
        int rt = Arrays.stream(times).max().getAsInt() * n;
        int answer = rt;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int people = count(times, mid); // mid 시간에 처리할 수 있는 사람 수

            if (people >= n) {  // 충분히 처리 가능 → 시간 줄이기
                answer = mid;
                rt = mid - 1;
            } else {  // 사람 수 부족 → 시간 늘리기
                lt = mid + 1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 처리해야 할 사람 수
        int m = sc.nextInt(); // 심사관 수
        int[] times = new int[m];
        for (int i = 0; i < m; i++) {
            times[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, times));
    }

}
