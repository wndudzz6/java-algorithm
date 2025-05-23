package ssafy;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class P23008D6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트케이스 수

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt(); // 가방 수
            int K = sc.nextInt(); // 추 종류 수

            // 각 가방의 추 정보 저장: List<map> 사용
            List<Map<Integer, Integer>> bags = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                int c = sc.nextInt(); // 이 가방에 들어있는 추의 총 개수
                Map<Integer, Integer> bag = new HashMap<>();

                for (int j = 0; j < c; j++) {
                    int kind = sc.nextInt(); // 추의 종류
                    bag.put(kind, bag.getOrDefault(kind, 0) + 1);
                }

                bags.add(bag);
            }

            // 일단 입력 확인용 출력 (테스트 단계) ~ 확률 문제는 몬테카를로 시뮬레이션을 쓴다고 함
            System.out.println("#" + tc);
            for (int i = 0; i < N; i++) {
                System.out.print("Bag " + (i + 1) + ": ");
                for (Map.Entry<Integer, Integer> entry : bags.get(i).entrySet()) {
                    System.out.print("[" + entry.getKey() + " x " + entry.getValue() + "] ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
