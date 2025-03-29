package twopointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1GPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 첫 번째 리스트의 크기
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }

        int m = sc.nextInt();  // 두 번째 리스트의 크기
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }

        // 두 리스트를 병합 및 정렬
        List<Integer> mergedList = merge(list1, list2);

        // 결과 출력
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    // 두 정렬된 리스트를 병합하는 메소드
    private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i++));
            } else {
                result.add(list2.get(j++));
            }
        }

        // 남은 요소들을 추가
        while (i < list1.size()) {
            result.add(list1.get(i++));
        }
        while (j < list2.size()) {
            result.add(list2.get(j++));
        }

        return result;
    }
}
